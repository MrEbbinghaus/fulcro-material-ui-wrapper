(ns material-ui.surfaces.accordion
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@material-ui/core/Accordion" :default Accordion]
               ["@material-ui/core/AccordionSummary" :default AccordionSummary]
               ["@material-ui/core/AccordionDetails" :default AccordionDetails]
               ["@material-ui/core/AccordionActions" :default AccordionActions]])))

(def accordion (interop/react-factory #?(:cljs Accordion :clj nil)))
(def summary (interop/react-factory #?(:cljs AccordionSummary :clj nil)))
(def details (interop/react-factory #?(:cljs AccordionDetails :clj nil)))
(def actions (interop/react-factory #?(:cljs AccordionActions :clj nil)))