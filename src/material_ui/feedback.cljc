(ns material-ui.feedback
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@material-ui/core/Backdrop" :default Backdrop]
               ["@material-ui/core/CircularProgress" :default CircularProgress]
               ["@material-ui/core/LinearProgress" :default LinearProgress]
               ["@material-ui/core/Snackbar" :default Snackbar]])))

(def linear-progress (interop/react-factory #?(:cljs LinearProgress :clj nil)))
(def circular-progress (interop/react-factory #?(:cljs CircularProgress :clj nil)))

(def snackbar (interop/react-factory #?(:cljs Snackbar :clj nil)))

(def backdrop (interop/react-factory #?(:cljs Backdrop :clj nil)))