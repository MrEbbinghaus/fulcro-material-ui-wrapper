(ns material-ui.styles
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs 
        [["@material-ui/core/styles" :refer [ThemeProvider createMuiTheme useTheme] :rename {styled mui-styled}]
         ["@material-ui/core/useMediaQuery" :default useMediaQuery]])))

(def theme-provider (interop/react-factory #?(:cljs ThemeProvider :default nil)))
(defn create-mui-theme [options & args]
  #?(:cljs
     (apply createMuiTheme (clj->js options) args)))

(defn use-theme []
  #?(:cljs (js->clj (useTheme) :keywordize-keys true)))

(defn prefers-dark? []
  #?(:cljs    (useMediaQuery "(prefers-color-scheme: dark)")
     :default false))

#?(:cljs 
    (defn styled 
      ([component style-m-or-f options]
        (let [styles (cond-> style-m-or-f (map? style-m-or-f) clj->js)]
          (interop/react-factory
            (if (map? style-m-or-f)
              ((mui-styled component) (clj->js style-m-or-f) (clj->js options))
              ((mui-styled component) (fn [theme] (clj->js (style-m-or-f (js->clj theme :keywordize-keys true)))) (clj->js options))))))))