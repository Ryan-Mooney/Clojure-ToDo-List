(defproject todo-list "0.1.0-SNAPSHOT"
  :description "A ToDo List Web App, made for learning purposes by Ryan Mooney"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  ;;When running locally, it is important to have the same version numbers next to each
  :dependencies [[org.clojure/clojure "1.10.1"]
                 ;;While this app uses ring, the asgard app uses http-kit to control their web connections
                 [ring "1.7.1"]]
  :repl-options {:init-ns todo-list.core}
  ;; :main setting below tells what to do when 'lein run' is ran
  :main todo-list.core
  ;; By adding a dev profile, the lein run command will look for this first during development.
  :profiles {:dev
             {:main todo-list.core/-dev-main}})
