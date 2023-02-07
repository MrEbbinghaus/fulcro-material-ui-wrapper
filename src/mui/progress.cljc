(ns mui.progress
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/LinearProgress" :default LinearProgress]])))

(def linear-progress (interop/react-factory #?(:cljs LinearProgress :clj nil)))