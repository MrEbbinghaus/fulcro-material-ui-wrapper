(ns material-ui.lab
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    [material-ui.feedback.skeleton :as feedback.skeleton]
    [material-ui.navigation.speed-dial :as navigation.speed-dial]
    #?@(:cljs [["@material-ui/core/Autocomplete" :default Autocomplete]])))

(def ^:deprecated speed-dial navigation.speed-dial/speed-dial)
(def ^:deprecated speed-dial-action navigation.speed-dial/action)

(def ^:deprecated skeleton feedback.skeleton/skeleton)

(def autocomplete (interop/react-factory #?(:cljs Autocomplete :clj nil)))