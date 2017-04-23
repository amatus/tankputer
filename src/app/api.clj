(ns app.api
  (:require [app.portmaster :as pm]
            [castra.core :refer [defrpc]]))

(defrpc get-state [])

(defrpc turn-on [port]
        (pm/turn-on port))

(defrpc turn-off [port]
        (pm/turn-off port))

(defrpc set-name [port name]
        (pm/set-name port name))
