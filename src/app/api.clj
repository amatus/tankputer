(ns app.api
  (:require [castra.core :refer [defrpc]]))

(defrpc get-state []
        {:inputs []
         :outputs []})
