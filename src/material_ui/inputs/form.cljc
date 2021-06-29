(ns material-ui.inputs.form
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs [["@material-ui/core/FormControl" :default FormControl]
              ["@material-ui/core/FormControlLabel" :default FormControlLabel]
              ["@material-ui/core/FormGroup" :default FormGroup]
              ["@material-ui/core/FormHelperText" :default FormHelperText]
              ["@material-ui/core/FormLabel" :default FormLabel]])))

(def control (interop/react-factory #?(:cljs FormControl :clj nil)))
(def control-label (interop/react-input-factory #?(:cljs FormControlLabel :clj nil)))
(def group (interop/react-factory #?(:cljs FormGroup :clj nil)))
(def helper-text (interop/react-factory #?(:cljs FormHelperText :clj nil)))
(def label (interop/react-factory #?(:cljs FormLabel :clj nil)))