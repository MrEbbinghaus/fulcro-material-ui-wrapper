(ns ^:deprecated material-ui.utils
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/CssBaseline" :default CssBaseline]
               ["@mui/material/FormControlLabel" :default FormControlLabel]
               ["@mui/material/useMediaQuery" :default useMediaQuery]
               ["@mui/material/ClickAwayListener" :default ClickAwayListener]])))

(def css-baseline (interop/react-factory #?(:cljs CssBaseline :clj nil)))
(def form-control-label (interop/react-factory #?(:cljs FormControlLabel :clj nil)))
(def use-media-query useMediaQuery)
(def click-away-listener (interop/react-factory #?(:cljs ClickAwayListener :clj nil)))