(ns mui.inputs.toggle-button
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/ToggleButton" :default ToggleButton]
               ["@mui/material/ToggleButtonGroup" :default ToggleButtonGroup]])))

(def button (interop/react-factory #?(:cljs ToggleButton :clj nil)))
(def button-group (interop/react-factory #?(:cljs ToggleButtonGroup :clj nil)))