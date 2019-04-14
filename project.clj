(defproject hden/debezium-embedded-potgres "0.1.0-SNAPSHOT"
  :description "Debezium DatabaseHistory and OffsetBackingStore implementations backed by JDBC."
  :url "https://github.com/hden/debezium-embedded-jdbc"
  :license {:name "Apache-2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/java.jdbc "0.7.8"]
                 [org.clojure/data.json "0.2.6"]
                 [org.apache.kafka/connect-runtime "2.1.1"]
                 [io.debezium/debezium-core "0.9.3.Final"]
                 [hikari-cp "2.7.1"]
                 [honeysql "0.9.4"]]
  :plugins [[lein-cloverage "1.1.1"]]
  :repl-options {:init-ns io.debezium.contrib.jdbc.core}
  :aot [io.debezium.contrib.jdbc.schema
        io.debezium.contrib.jdbc.offset]
  :profiles
  {:uberjar {:aot :all}
   :dev {:dependencies [[org.xerial/sqlite-jdbc "3.25.2"]
                        [org.slf4j/slf4j-nop "1.8.0-beta4"]]}})