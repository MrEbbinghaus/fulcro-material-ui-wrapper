(ns material-ui.inputs.input
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs [["@material-ui/core/Input" :default Input]
              ["@material-ui/core/InputBase" :default InputBase]
              ["@material-ui/core/InputAdornment" :default InputAdornment]
              ["@material-ui/core/InputLabel" :default InputLabel]
              ["@material-ui/core/FilledInput" :default FilledInput]
              ["@material-ui/core/OutlinedInput" :default OutlinedInput]])))

(def input (interop/react-input-factory #?(:cljs Input :clj nil)))
(def base (interop/react-input-factory #?(:cljs InputBase :clj nil)))
(def adornment (interop/react-factory #?(:cljs InputAdornment :clj nil)))
(def label (interop/react-factory #?(:cljs InputLabel :clj nil)))

(def filled-input (interop/react-input-factory #?(:cljs FilledInput :clj nil)))
(def outlined-input (interop/react-input-factory #?(:cljs OutlinedInput :clj nil)))
