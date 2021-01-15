(ns material-ui.navigation.tabs
  (:refer-clojure :exclude [list])
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs [["@material-ui/core/Tab" :default Tab]
              ["@material-ui/core/TabScrollButton" :default TabScrollButton]
              ["@material-ui/core/Tabs" :default Tabs]
              ["@material-ui/lab/TabContext" :default TabContext]
              ["@material-ui/lab/TabList" :default TabList]
              ["@material-ui/lab/TabPanel" :default TabPanel]])))

(def tab (interop/react-factory #?(:cljs Tab :clj nil)))
(def context (interop/react-factory #?(:cljs TabContext :clj nil)))
(def list (interop/react-factory #?(:cljs TabList :clj nil)))
(def panel (interop/react-factory #?(:cljs TabPanel :clj nil)))
(def scroll-button (interop/react-factory #?(:cljs TabScrollButton :clj nil)))
(def tabs (interop/react-factory #?(:cljs Tabs :clj nil)))
