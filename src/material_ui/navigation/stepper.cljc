(ns material-ui.navigation.stepper
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs
       [["@material-ui/core/MobileStepper" :default MobileStepper]
        ["@material-ui/core/Step" :default Step]
        ["@material-ui/core/StepButton" :default StepButton]
        ["@material-ui/core/StepConnector" :default StepConnector]
        ["@material-ui/core/StepContent" :default StepContent]
        ["@material-ui/core/StepIcon" :default StepIcon]
        ["@material-ui/core/StepLabel" :default StepLabel]
        ["@material-ui/core/Stepper" :default Stepper]])))

(def stepper (interop/react-factory #?(:cljs Stepper :clj nil)))
(def mobile-stepper (interop/react-factory #?(:cljs MobileStepper :clj nil)))

(def step (interop/react-factory #?(:cljs Step :clj nil)))
(def step-button (interop/react-factory #?(:cljs StepButton :clj nil)))
(def step-connector (interop/react-factory #?(:cljs StepConnector :clj nil)))
(def step-content (interop/react-factory #?(:cljs StepContent :clj nil)))

(def step-icon (interop/react-factory #?(:cljs StepIcon :clj nil)))
(def step-label (interop/react-factory #?(:cljs StepLabel :clj nil)))

