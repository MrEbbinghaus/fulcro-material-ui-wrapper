(ns material-ui.utils
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@material-ui/core/CssBaseline" :default CssBaseline]
               ["@material-ui/core/FormControlLabel" :default FormControlLabel]
               ["@material-ui/core/useMediaQuery" :default useMediaQuery]
               ["@material-ui/core/ClickAwayListener" :default ClickAwayListener]])))

(def css-baseline (interop/react-factory #?(:cljs CssBaseline :clj nil)))
(def form-control-label (interop/react-factory #?(:cljs FormControlLabel :clj nil)))
(def use-media-query useMediaQuery)
(def click-away-listener (interop/react-factory #?(:cljs ClickAwayListener :clj nil)))