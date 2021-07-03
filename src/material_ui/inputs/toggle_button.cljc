(ns material-ui.inputs.toggle-button
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@material-ui/core/ToggleButton" :default ToggleButton]
               ["@material-ui/core/ToggleButtonGroup" :default ToggleButtonGroup]])))

(def button (interop/react-factory #?(:cljs ToggleButton :clj nil)))
(def button-group (interop/react-factory #?(:cljs ToggleButtonGroup :clj nil)))