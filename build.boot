(set-env!
  :dependencies '[[adzerk/boot-cljs          "1.7.228-2"]
                  [adzerk/boot-cljs-repl     "0.3.3"]
                  [cljsjs/semantic-ui        "2.2.4-0"]
                  [com.cemerick/piggieback   "0.2.1"  :scope "test"]
                  [compojure                 "1.5.1"]
                  [hoplon/castra             "3.0.0-alpha5"]
                  [hoplon                    "6.0.0-alpha17.amatus0"]
                  [net.sf.expectit/expectit-core "0.8.2"]
                  [org.clojure/clojure       "1.7.0"]
                  [org.clojure/clojurescript "1.7.170"]
                  [org.clojure/tools.nrepl   "0.2.12" :scope "test"]
                  [pandeiro/boot-http        "0.7.6"]
                  [ring                      "1.5.0"]
                  [ring/ring-defaults        "0.3.0-beta1"]
                  [simpledb                  "0.1.4"]
                  [weasel                    "0.7.0"  :scope "test"]]
  :source-paths   #{"src"}
  :resource-paths #{"assets"})

(require
  '[adzerk.boot-cljs      :refer [cljs]]
  '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]]
  '[hoplon.boot-hoplon    :refer [hoplon prerender]]
  '[pandeiro.boot-http    :refer [serve]])

(deftask dev
  "Build tankputer for local development."
  []
  (comp
    (watch)
    ;(speak)
    (hoplon)
    (cljs-repl)
    (cljs)
    (serve
      :handler 'app.handler/app
      :reload true
      :port 8000)))

(deftask dev-repl
  "Run clojure repl."
  []
  (repl))

(deftask prod
  "Build tankputer for production deployment."
  []
  (comp
    (hoplon)
    (cljs :optimizations :advanced)
    (prerender)
    (aot :all true)
    (uber)
    (jar :main 'app.core :file "tankputer.jar")
    (target :dir #{"target"})))

;; vim: set expandtab ts=2 sw=2 filetype=clojure :
