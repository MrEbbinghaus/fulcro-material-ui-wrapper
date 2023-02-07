(ns ^:deprecated material-ui.feedback.alert
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/Alert" :default Alert]
               ["@mui/material/AlertTitle" :default AlertTitle]])))

(def alert (interop/react-factory #?(:cljs Alert :clj nil)))
(def title (interop/react-factory #?(:cljs AlertTitle :clj nil)))