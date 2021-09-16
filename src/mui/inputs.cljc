(ns mui.inputs
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs
        [["@mui/material/TextField" :default TextField]
         ["@mui/material/Button" :default Button]
         ["@mui/material/ButtonBase" :default ButtonBase]
         ["@mui/material/ButtonGroup" :default ButtonGroup]
         ["@mui/material/Fab" :default Fab]
         ["@mui/material/IconButton" :default IconButton]
         ["@mui/material/InputBase" :default InputBase]
         ["@mui/material/InputAdornment" :default InputAdornment]
         ["@mui/material/Checkbox" :default Checkbox]
         ["@mui/material/Select" :default Select]
         ["@mui/material/NativeSelect" :default NativeSelect]
         ["@mui/material/Switch" :default Switch]
         ["@mui/material/Radio" :default Radio]
         ["@mui/material/RadioGroup" :default RadioGroup]
         ["@mui/lab/LoadingButton" :default LoadingButton]])))

(def textfield (interop/react-factory #?(:cljs TextField :clj nil)))
(def button (interop/react-factory #?(:cljs Button :clj nil)))
(def button-base (interop/react-factory #?(:cljs ButtonBase :clj nil)))
(def loading-button (interop/react-factory #?(:cljs LoadingButton :clj nil)))
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