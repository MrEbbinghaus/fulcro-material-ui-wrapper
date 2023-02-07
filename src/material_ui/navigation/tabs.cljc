(ns ^:deprecated material-ui.navigation.tabs
  (:refer-clojure :exclude [list])
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/Tab" :default Tab]
               ["@mui/material/TabScrollButton" :default TabScrollButton]
               ["@mui/material/Tabs" :default Tabs]
               #_["@mui/material/TabContext" :default TabContext]
               #_["@mui/material/TabList" :default TabList]
               #_["@mui/material/TabPanel" :default TabPanel]])))

(def tab (interop/react-factory #?(:cljs Tab :clj nil)))
#_(def context (interop/react-factory #?(:cljs TabContext :clj nil)))
#_(def list (interop/react-factory #?(:cljs TabList :clj nil)))
#_(def panel (interop/react-factory #?(:cljs TabPanel :clj nil)))
(def scroll-button (interop/react-factory #?(:cljs TabScrollButton :clj nil)))
(def tabs (interop/react-factory #?(:cljs Tabs :clj nil)))
