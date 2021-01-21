(ns material-ui.inputs.form
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs [["@material-ui/core/FormControl" :default FormControl]
              ["@material-ui/core/FormControlLabel" :default FormControlLabel]
              ["@material-ui/core/FormGroup" :default FormGroup]
              ["@material-ui/core/FormHelperText" :default FormHelperText]
              ["@material-ui/core/FormLabel" :default FormLabel]])))

(def control (interop/react-input-factory #?(:cljs FormControl :clj nil)))
(def control-label (interop/react-input-factory #?(:cljs FormControlLabel :clj nil)))
(def group (interop/react-input-factory #?(:cljs FormGroup :clj nil)))
(def helper-text (interop/react-input-factory #?(:cljs FormHelperText :clj nil)))
(def label (interop/react-input-factory #?(:cljs FormLabel :clj nil)))