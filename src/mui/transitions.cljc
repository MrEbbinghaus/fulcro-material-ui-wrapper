(ns mui.transitions
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/Fade" :default Fade]
               ["@mui/material/Collapse" :default Collapse]
               ["@mui/material/Grow" :default Grow]
               ["@mui/material/Zoom" :default Zoom]
               ["@mui/material/Slide" :default Slide]])))

(def fade (interop/react-factory #?(:cljs Fade :clj nil)))
(def collapse (interop/react-factory #?(:cljs Collapse :clj nil)))
(def grow (interop/react-factory #?(:cljs Grow :clj nil)))
(def zoom (interop/react-factory #?(:cljs Zoom :clj nil)))
(def slide (interop/react-factory #?(:cljs Slide :clj nil)))