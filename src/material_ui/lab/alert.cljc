(ns material-ui.lab.alert
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs [["@material-ui/lab/Alert" :default Alert]
              ["@material-ui/lab/AlertTitle" :default AlertTitle]])))

(def alert (interop/react-factory #?(:cljs Alert :clj nil)))
(def title (interop/react-factory #?(:cljs AlertTitle :clj nil)))