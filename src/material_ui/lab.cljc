(ns material-ui.lab
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@material-ui/lab/SpeedDial" :default SpeedDial]
               ["@material-ui/lab/SpeedDialAction" :default SpeedDialAction]
               ["@material-ui/lab/SpeedDialIcon" :default SpeedDialIcon]
               ["@material-ui/lab/Skeleton" :default Skeleton]
               ["@material-ui/lab/Autocomplete" :default Autocomplete]])))

(def speed-dial (interop/react-factory #?(:cljs SpeedDial :clj nil)))
(def speed-dial-action (interop/react-factory #?(:cljs SpeedDialAction :clj nil)))

(def ^{:arglists '({:keys [animation classes component height variant width]} & children)} 
  skeleton (interop/react-factory #?(:cljs Skeleton :clj nil)))

(def autocomplete (interop/react-factory #?(:cljs Autocomplete :clj nil)))