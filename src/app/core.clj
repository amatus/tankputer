(ns app.core
  (:gen-class)
  (:require [app.handler :refer [app]]
            [ring.adapter.jetty :refer [run-jetty]]))

(defn -main
  [& args]
  (run-jetty app {:port 80}))
