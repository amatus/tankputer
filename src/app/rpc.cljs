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

(def turn-on
  (mkremote 'app.api/turn-on state error loading))

(def turn-off
  (mkremote 'app.api/turn-off state error loading))

(def set-name
  (mkremote 'app.api/set-name state error loading))

(defn init []
  (get-state)
  (js/setInterval get-state 1000))
