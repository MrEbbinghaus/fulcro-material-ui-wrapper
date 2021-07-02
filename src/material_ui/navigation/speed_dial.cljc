(ns material-ui.navigation.speed-dial
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs [["@material-ui/lab/SpeedDial" :default SpeedDial]
              ["@material-ui/lab/SpeedDialAction" :default SpeedDialAction]
              ["@material-ui/lab/SpeedDialIcon" :default SpeedDialIcon]])))

(def speed-dial (interop/react-factory #?(:cljs SpeedDial :clj nil)))
(def action (interop/react-factory #?(:cljs SpeedDialAction :clj nil)))
(def icon (interop/react-factory #?(:cljs SpeedDialIcon :clj nil)))