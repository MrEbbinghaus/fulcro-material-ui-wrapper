(ns material-ui.navigation.tabs
  (:refer-clojure :exclude [list])
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@material-ui/core/Tab" :default Tab]
               ["@material-ui/core/TabScrollButton" :default TabScrollButton]
               ["@material-ui/core/Tabs" :default Tabs]
               #_["@material-ui/core/TabContext" :default TabContext]
               #_["@material-ui/core/TabList" :default TabList]
               #_["@material-ui/core/TabPanel" :default TabPanel]])))

(def tab (interop/react-factory #?(:cljs Tab :clj nil)))
#_(def context (interop/react-factory #?(:cljs TabContext :clj nil)))
#_(def list (interop/react-factory #?(:cljs TabList :clj nil)))
#_(def panel (interop/react-factory #?(:cljs TabPanel :clj nil)))
(def scroll-button (interop/react-factory #?(:cljs TabScrollButton :clj nil)))
(def tabs (interop/react-factory #?(:cljs Tabs :clj nil)))
