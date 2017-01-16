(ns app.temperature
  (:import (java.nio.file Files Paths)
           (java.util.concurrent Executors TimeUnit)))

(def temp (agent nil))

(defn poll
  [state]
  (let [path (Paths/get "/sys/bus/w1/devices" (make-array String 0))
        devices (Files/newDirectoryStream path "28-*")
        files (map #(.resolve % "w1_slave") devices)
        temperatures (map (fn [file]
                            (let [id (.. file
                                       (getName 4)
                                       (toString)
                                       (substring 3))
                                  temp (-> (Files/readAllLines
                                             file StandardCharsets/UTF_8)
                                         (second)
                                         (.split "t=")
                                         (second))]
                              [id temp])) files)]
    (assoc state :state temperatures)))

(defn init
  []
  (let [executor (Executors/newSingleThreadScheduledExecutor)]
    (.scheduleAtFixedRate executor #(send temp poll) 0 10 TimeUnit/SECONDS)))
