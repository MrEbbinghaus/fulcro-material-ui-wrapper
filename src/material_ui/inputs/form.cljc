(ns ^:deprecated material-ui.inputs.form
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/FormControl" :default FormControl]
               ["@mui/material/FormControlLabel" :default FormControlLabel]
               ["@mui/material/FormGroup" :default FormGroup]
               ["@mui/material/FormHelperText" :default FormHelperText]
               ["@mui/material/FormLabel" :default FormLabel]])))

(def control (interop/react-factory #?(:cljs FormControl :clj nil)))
(def control-label (interop/react-input-factory #?(:cljs FormControlLabel :clj nil)))
(def group (interop/react-factory #?(:cljs FormGroup :clj nil)))
(def helper-text (interop/react-factory #?(:cljs FormHelperText :clj nil)))
(def label (interop/react-factory #?(:cljs FormLabel :clj nil)))