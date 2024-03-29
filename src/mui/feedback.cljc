(ns mui.feedback
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/Backdrop" :default Backdrop]
               ["@mui/material/CircularProgress" :default CircularProgress]
               ["@mui/material/LinearProgress" :default LinearProgress]
               ["@mui/material/Snackbar" :default Snackbar]])))

(def linear-progress (interop/react-factory #?(:cljs LinearProgress :clj nil)))
(def circular-progress (interop/react-factory #?(:cljs CircularProgress :clj nil)))

(def snackbar (interop/react-factory #?(:cljs Snackbar :clj nil)))

(def backdrop (interop/react-factory #?(:cljs Backdrop :clj nil)))