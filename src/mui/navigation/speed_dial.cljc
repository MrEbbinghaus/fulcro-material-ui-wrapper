(ns mui.navigation.speed-dial
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/SpeedDial" :default SpeedDial]
               ["@mui/material/SpeedDialAction" :default SpeedDialAction]
               ["@mui/material/SpeedDialIcon" :default SpeedDialIcon]])))

(def speed-dial (interop/react-factory #?(:cljs SpeedDial :clj nil)))
(def action (interop/react-factory #?(:cljs SpeedDialAction :clj nil)))
(def icon (interop/react-factory #?(:cljs SpeedDialIcon :clj nil)))