(defproject cljs-persistent-hash-map-test "0.0.1-SNAPSHOT"
  :description "Perf tests for ClojureScript port of Clojure's PersistentHashMap"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-path "src/clj/"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 ;; locally built from
                 ;; https://github.com/michalmarczyk/clojurescript/tree/large-map-conversion-threshold
                 [org.clojure/clojurescript "0.0-1134"]]
  :plugins [[lein-cljsbuild "0.1.7"]]
  :cljsbuild {:builds [{:source-path "src/cljs/"
                        :compiler {:output-to "phm.js"
                                   :optimizations :advanced
                                   :pretty-print false}}]})
