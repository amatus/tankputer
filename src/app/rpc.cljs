(ns app.rpc
  (:require-macros
    [javelin.core :refer [defc defc=]])
  (:require
    [javelin.core]
    [castra.core :refer [mkremote]]))

(defc state nil)
(defc error nil)
(defc loading nil)

(def get-state
  (mkremote 'app.api/get-state state error loading))

(defn init []
  (get-state)
  (js/setInterval get-state 1000))
