(ns material-ui.feedback.alert
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs [["@material-ui/core/Alert" :default Alert]
              ["@material-ui/core/AlertTitle" :default AlertTitle]])))

(def alert (interop/react-factory #?(:cljs Alert :clj nil)))
(def title (interop/react-factory #?(:cljs AlertTitle :clj nil)))