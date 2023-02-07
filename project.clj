(defproject com.github.mrebbinghaus/fulcro-material-ui-wrapper "5.0.0-beta.0.0"
  :description "Wrapper of https://material-ui.com/ for fulcro"
  :url "https://github.com/MrEbbinghaus/fulcro-material-ui-wrapper"
  :license {:name "MIT"
            :url "https://github.com/MrEbbinghaus/fulcro-material-ui-wrapper/blob/master/LICENSE"}
  :source-paths ["src"]
  :dependencies
  [[org.clojure/clojurescript "1.10.764" :scope "provided"]
   [com.fulcrologic/fulcro "3.2.8" :scope "provided"]]
  :aliases {"pre-release" [["vcs" "assert-committed"]
                           ["change" "version" "leiningen.release/bump-version" "release"]
                           ["vcs" "commit"]
                           ["vcs" "tag" "v"]]

            "post-release" [["change" "version" "leiningen.release/bump-version"]
                            ["vcs" "commit"]
                            ["vcs" "push"]]})