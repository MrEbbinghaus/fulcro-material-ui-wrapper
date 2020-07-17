(ns material-ui.transitions
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@material-ui/core/Fade" :default Fade]
               ["@material-ui/core/Collapse" :default Collapse]
               ["@material-ui/core/Grow" :default Grow]
               ["@material-ui/core/Zoom" :default Zoom]
               ["@material-ui/core/Slide" :default Slide]])))

(def fade (interop/react-factory #?(:cljs Fade :clj nil)))
(def collapse (interop/react-factory #?(:cljs Collapse :clj nil)))
(def grow (interop/react-factory #?(:cljs Grow :clj nil)))
(def zoom (interop/react-factory #?(:cljs Zoom :clj nil)))
(def slide (interop/react-factory #?(:cljs Slide :clj nil)))