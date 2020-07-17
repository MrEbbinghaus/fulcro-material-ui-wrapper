(ns material-ui.surfaces
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@material-ui/core/Paper" :default Paper]
               ["@material-ui/core/AppBar" :default AppBar]
               ["@material-ui/core/Toolbar" :default ToolBar]
               ["@material-ui/core/Card" :default Card]
               ["@material-ui/core/CardContent" :default CardContent]
               ["@material-ui/core/CardActions" :default CardActions]
               ["@material-ui/core/CardHeader" :default CardHeader]
               ["@material-ui/core/CardMedia" :default CardMedia]
               ["@material-ui/core/CardActionArea" :default CardActionArea]
               ["@material-ui/core/Accordion" :default Accordion]
               ["@material-ui/core/AccordionSummary" :default AccordionSummary]
               ["@material-ui/core/AccordionDetails" :default AccordionDetails]
               ["@material-ui/core/AccordionActions" :default AccordionActions]])))

(def paper (interop/react-factory #?(:cljs Paper :clj nil)))
(def app-bar (interop/react-factory #?(:cljs AppBar :clj nil)))
(def toolbar (interop/react-factory #?(:cljs ToolBar :clj nil)))

(def card (interop/react-factory #?(:cljs Card :clj nil)))
(def card-content (interop/react-factory #?(:cljs CardContent :clj nil)))
(def card-actions (interop/react-factory #?(:cljs CardActions :clj nil)))
(def card-action-area (interop/react-factory #?(:cljs CardActionArea :clj nil)))
(def card-header (interop/react-factory #?(:cljs CardHeader :clj nil)))
(def card-media (interop/react-factory #?(:cljs CardMedia :clj nil)))

(def accordion (interop/react-factory #?(:cljs Accordion :clj nil)))
(def accordion-panel-summary (interop/react-factory #?(:cljs AccordionSummary :clj nil)))
(def accordion-panel-details (interop/react-factory #?(:cljs AccordionDetails :clj nil)))
(def accordion-panel-actions (interop/react-factory #?(:cljs AccordionActions :clj nil)))

(def expansion-panel accordion)
(def expansion-panel-summary accordion-panel-summary)
(def expansion-panel-details accordion-panel-details)
(def expansion-panel-actions accordion-panel-actions)
