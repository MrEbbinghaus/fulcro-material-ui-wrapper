(ns material-ui.lab.toggle-button
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs [["@material-ui/lab/ToggleButton" :default ToggleButton]
              ["@material-ui/lab/ToggleButtonGroup" :default ToggleButtonGroup]])))

(def button (interop/react-factory #?(:cljs ToggleButton :clj nil)))
(def button-group (interop/react-factory #?(:cljs ToggleButtonGroup :clj nil)))