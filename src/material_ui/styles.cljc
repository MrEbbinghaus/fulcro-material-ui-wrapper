(ns ^:deprecated material-ui.styles
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs
        [["@mui/material/styles" :refer [ThemeProvider createMuiTheme useTheme] :rename {styled mui-styled}]
         ["@mui/material/useMediaQuery" :default useMediaQuery]])))

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
      ([component style-m-or-f]
       (styled component style-m-or-f {}))
      ([component style-m-or-f options]
       (let [styled-component (mui-styled component)]
         (interop/react-factory
           (if (map? style-m-or-f)
             (styled-component (clj->js style-m-or-f) (clj->js options))
             (styled-component      
               #(-> % (js->clj :keywordize-keys true) style-m-or-f clj->js)
               (clj->js options))))))))