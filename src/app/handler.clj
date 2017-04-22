(ns app.handler
  (:require [app.portmaster :as pm]
            [app.temperature :as temp]
            [castra.middleware :as castra]
            [compojure.core :as c]
            [compojure.route :as route]
            [ring.middleware.defaults :as d]
            [ring.util.response :as response]
            [simpledb.core :as db]))

(c/defroutes app-routes
  (c/GET "/" req (response/content-type (response/resource-response "index.html") "text/html"))
  (route/resources "/" {:root ""}))

(defn state-fn []
  {:temps @temp/temp
   :pm (select-keys @pm/pm [:status :current])})

(def app
  (-> app-routes
      (castra/wrap-castra {:state-fn state-fn} 'app.api)
      (d/wrap-defaults d/api-defaults)))

(db/init)

(let [{:keys [init port-name username password]} (db/get :portmaster)]
  (when init
    (pm/init port-name username password)))

(let [{:keys [init]} (db/get :temperature)]
  (when init
    (temp/init)))
