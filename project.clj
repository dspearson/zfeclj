(defproject zfeclj "master-SNAPSHOT"
  :description "zfec bindings for Clojure"
  :url "https://github.com/dspearson/zfeclj"
  :license {:name "ISC Licence"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot zfeclj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
