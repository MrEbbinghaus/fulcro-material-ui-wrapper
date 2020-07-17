(ns material-ui.inputs
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@material-ui/core/TextField" :default TextField]
               ["@material-ui/core/Button" :default Button]
               ["@material-ui/core/Fab" :default Fab]
               ["@material-ui/core/IconButton" :default IconButton]
               ["@material-ui/core/InputBase" :default InputBase]
               ["@material-ui/core/InputAdornment" :default InputAdornment]
               ["@material-ui/core/Checkbox" :default Checkbox]
               ["@material-ui/core/Select" :default Select]
               ["@material-ui/core/NativeSelect" :default NativeSelect]])))

(def textfield (interop/react-input-factory #?(:cljs TextField :clj nil)))
(def button (interop/react-factory #?(:cljs Button :clj nil)))
(def fab (interop/react-factory #?(:cljs Fab :clj nil)))
(def icon-button (interop/react-factory #?(:cljs IconButton :clj nil)))
(def input-base (interop/react-input-factory #?(:cljs InputBase :clj nil)))
(def input-adornment (interop/react-factory #?(:cljs InputAdornment :clj nil)))
(def checkbox (interop/react-input-factory #?(:cljs Checkbox :clj nil)))

(def select (interop/react-input-factory #?(:cljs Select :clj nil)))
(def native-select (interop/react-input-factory #?(:cljs NativeSelect :clj nil)))