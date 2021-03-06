(ns material-ui.inputs
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@material-ui/core/TextField" :default TextField]
               ["@material-ui/core/Button" :default Button]
               ["@material-ui/core/ButtonBase" :default ButtonBase]
               ["@material-ui/core/ButtonGroup" :default ButtonGroup]
               ["@material-ui/core/Fab" :default Fab]
               ["@material-ui/core/IconButton" :default IconButton]
               ["@material-ui/core/InputBase" :default InputBase]
               ["@material-ui/core/InputAdornment" :default InputAdornment]
               ["@material-ui/core/Checkbox" :default Checkbox]
               ["@material-ui/core/Select" :default Select]
               ["@material-ui/core/NativeSelect" :default NativeSelect]
               ["@material-ui/core/Switch" :default Switch]
               ["@material-ui/core/Radio" :default Radio]
               ["@material-ui/core/RadioGroup" :default RadioGroup]])))

(def textfield (interop/react-factory #?(:cljs TextField :clj nil)))
(def button (interop/react-factory #?(:cljs Button :clj nil)))
(def button-base (interop/react-factory #?(:cljs ButtonBase :clj nil)))
(def button-group (interop/react-factory #?(:cljs ButtonGroup :clj nil)))
(def switch (interop/react-factory #?(:cljs Switch :clj nil)))

(def fab (interop/react-factory #?(:cljs Fab :clj nil)))
(def icon-button (interop/react-factory #?(:cljs IconButton :clj nil)))
(def input-base (interop/react-input-factory #?(:cljs InputBase :clj nil)))
(def input-adornment (interop/react-factory #?(:cljs InputAdornment :clj nil)))
(def checkbox (interop/react-input-factory #?(:cljs Checkbox :clj nil)))

(def select (interop/react-factory #?(:cljs Select :clj nil)))
(def native-select (interop/react-input-factory #?(:cljs NativeSelect :clj nil)))

(def radio (interop/react-factory #?(:cljs Radio :clj nil)))
(def radio-group (interop/react-factory #?(:cljs RadioGroup :clj nil)))