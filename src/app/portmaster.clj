(ns app.portmaster
  (:import (java.io File)
           (java.util.concurrent TimeUnit)
           (net.sf.expectit ExpectBuilder)))

(def pm (agent nil))

(defn init
  [port-name]
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
                 (withTimeout 1 TimeUnit/SECONDS)
                 (withExceptionOnFailure)
                 (build))]
    (send pm assoc :socat socat :expect expect)))
