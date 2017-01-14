(ns app.portmaster
  (:import java.io.File
           (java.util.concurrent Executors TimeUnit)
           net.sf.expectit.ExpectBuilder
           net.sf.expectit.matcher.Matchers))

(def prompt (Matchers/contains "pm>"))
(def the-unexpected (Matchers/anyString)) ; I couldn't help myself

(def pm (agent nil))

(defn parse-status
  [s]
  (map rest (re-seq #" ([0-9]+)\t([^\t]+)\t([^\t]+)\t([^\t]+)" s)))

(defn parse-current
  [s]
  (map rest (re-seq #"#([0-9]+).* ([0-9.]+)A.* ([0-9.]+)A" s)))

(defn login-maybe
  [expect username password]
  ; flush input
  (try
    (.. expect
      (withTimeout 1 TimeUnit/MILLISECONDS)
      (expect the-unexpected))
    (catch Exception e))
  (let [matchers (into-array [(Matchers/contains "Username:")
                              (Matchers/contains "Enter choice (1 or 2):")
                              prompt])
        results (.getResults (.. expect
                               (withTimeout 100 TimeUnit/MILLISECONDS)
                               (sendLine)
                               (expect (Matchers/anyOf matchers))))]
    (when (.isSuccessful (first results))
      (.. expect
        (sendLine username)
        (expect (Matchers/contains "Password:")))
      (.. expect
        (sendLine password)
        (expect prompt)))
    (when (.isSuccessful (second results))
      (.. expect
        (withTimeout 5000 TimeUnit/MILLISECONDS)
        (sendLine "2")
        (expect (Matchers/contains "Username:")))
      (login-maybe expect username password))))

(defn do-command
  ([expect command]
   (.. expect (sendLine command) (expect prompt)))
  ([command]
   (send pm (fn [{:keys [expect] :as state}]
              (do-command expect command)
              state))))

(defn poll
  [{:keys [expect] :as state} username password]
  (try
    (login-maybe expect username password)
    (let [result (do-command expect "status all")
          status (parse-status (.getBefore result))
          state (if (nil? status)
                  state
                  (assoc state :status status))
          result (do-command expect "current")
          current (parse-current (.getBefore result))
          state (if (nil? current)
                  state
                  (assoc state :current current))]
      state)
    (catch Exception e
      (println "poll failed")
      (println (.getMessage e))
      state)))

(defn turn-on
  [port]
  ; TODO: updated the status
  (do-command (str "on " port)))

(defn turn-off
  [port]
  (do-command (str "off " port)))

(defn init
  [port-name username password]
  (let [socat (.. (new ProcessBuilder
                       (into-array ["socat"
                                    "-v"
                                    (str "OPEN:" port-name ",b9600,raw")
                                    "-"]))
                (redirectError (new File "/tmp/portmaster.log"))
                (start))
        expect (.. (new ExpectBuilder)
                 (withInputs (into-array [(.getInputStream socat)]))
                 (withOutput (.getOutputStream socat))
                 (withTimeout 1000 TimeUnit/MILLISECONDS)
                 (withExceptionOnFailure)
                 (build))
        executor (Executors/newSingleThreadScheduledExecutor)]
    (send pm assoc :socat socat :expect expect)
    (.scheduleAtFixedRate executor #(send pm poll username password) 2 10 TimeUnit/SECONDS)))
