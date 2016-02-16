(ns sample.app
  (:require [ring.adapter.jetty :as jetty]
            [compojure.core :refer [defroutes GET]]
            [clojure.java.jdbc :as sql]))

(defroutes handler
  (GET "/" []
       {:headers {"Content-type" "text/plain; charset=UTF-8"}
        :body (sql/query (System/getenv "DATABASE_URL")
                         "select * from users limit 5")}))

(defn -main []
  (jetty/run-jetty handler
                   {:port (Integer. (or (System/getenv "PORT") "8080"))
                    :join? false}))
