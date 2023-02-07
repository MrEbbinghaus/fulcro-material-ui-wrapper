(ns mui.navigation.stepper
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs
        [["@mui/material/MobileStepper" :default MobileStepper]
         ["@mui/material/Step" :default Step]
         ["@mui/material/StepButton" :default StepButton]
         ["@mui/material/StepConnector" :default StepConnector]
         ["@mui/material/StepContent" :default StepContent]
         ["@mui/material/StepIcon" :default StepIcon]
         ["@mui/material/StepLabel" :default StepLabel]
         ["@mui/material/Stepper" :default Stepper]])))

(def stepper (interop/react-factory #?(:cljs Stepper :clj nil)))
(def mobile-stepper (interop/react-factory #?(:cljs MobileStepper :clj nil)))

(def step (interop/react-factory #?(:cljs Step :clj nil)))
(def step-button (interop/react-factory #?(:cljs StepButton :clj nil)))
(def step-connector (interop/react-factory #?(:cljs StepConnector :clj nil)))
(def step-content (interop/react-factory #?(:cljs StepContent :clj nil)))

(def step-icon (interop/react-factory #?(:cljs StepIcon :clj nil)))
(def step-label (interop/react-factory #?(:cljs StepLabel :clj nil)))

