(ns mui.surfaces.accordion
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/Accordion" :default Accordion]
               ["@mui/material/AccordionSummary" :default AccordionSummary]
               ["@mui/material/AccordionDetails" :default AccordionDetails]
               ["@mui/material/AccordionActions" :default AccordionActions]])))

(def accordion (interop/react-factory #?(:cljs Accordion :clj nil)))
(def summary (interop/react-factory #?(:cljs AccordionSummary :clj nil)))
(def details (interop/react-factory #?(:cljs AccordionDetails :clj nil)))
(def actions (interop/react-factory #?(:cljs AccordionActions :clj nil)))