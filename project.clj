(defproject clojure-sample "1.0.1"
  :description "Hello World Clojure Web App"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.1"]
                 [ring/ring-jetty-adapter "1.1.2"]
                 [org.clojure/java.jdbc "0.4.1"]
                 [org.postgresql/postgresql "9.4-1201-jdbc41"]
                 ]
  :main ^:skip-aot sample.app)
