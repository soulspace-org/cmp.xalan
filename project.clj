(defproject org.soulspace.clj/cmp.xalan "0.3.0"
  :description "Clojure Xalan component for performing XSL transformations."
  :url "https://github.com/lsolbach/CljComponents"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  ; use deps.edn dependencies
  :plugins [[lein-tools-deps "0.4.5"]]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :lein-tools-deps/config {:config-files [:install :user :project]}

  :test-paths ["test"]
  :scm {:name "git" :url "https://github.com/soulspace-org/cmp.xalan"}
  :deploy-repositories [["clojars"  {:sign-releases false :url "https://clojars.org/repo"}]])

