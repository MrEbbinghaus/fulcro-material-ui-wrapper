(ns ^:deprecated material-ui.inputs.input
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/Input" :default Input]
               ["@mui/material/InputBase" :default InputBase]
               ["@mui/material/InputAdornment" :default InputAdornment]
               ["@mui/material/InputLabel" :default InputLabel]
               ["@mui/material/FilledInput" :default FilledInput]
               ["@mui/material/OutlinedInput" :default OutlinedInput]])))

(def input (interop/react-input-factory #?(:cljs Input :clj nil)))
(def base (interop/react-input-factory #?(:cljs InputBase :clj nil)))
(def adornment (interop/react-factory #?(:cljs InputAdornment :clj nil)))
(def label (interop/react-factory #?(:cljs InputLabel :clj nil)))

(def filled-input (interop/react-input-factory #?(:cljs FilledInput :clj nil)))
(def outlined-input (interop/react-input-factory #?(:cljs OutlinedInput :clj nil)))
