(ns material-ui.lab
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [[com.fulcrologic.fulcro.dom :as dom]
               ["@material-ui/lab/SpeedDial" :default SpeedDial]
               ["@material-ui/lab/SpeedDialAction" :default SpeedDialAction]
               ["@material-ui/lab/SpeedDialIcon" :default SpeedDialIcon]
               ["@material-ui/lab/Skeleton" :default Skeleton]
               ["@material-ui/lab/Autocomplete" :default Autocomplete]])))

(def speed-dial (interop/react-factory #?(:cljs SpeedDial :clj nil)))
(def speed-dial-action (interop/react-factory #?(:cljs SpeedDialAction :clj nil)))

(def ^{:arglists '({:keys [animation classes component height variant width]} & children)}
  skeleton (interop/react-factory #?(:cljs Skeleton :clj nil)))

#_(def autocomplete (interop/react-factory #?(:cljs Autocomplete :clj nil)))

(def autocomplete
  (fn [{:keys [value] :as props} & children]
    #?(:cljs
       (let [js-props
             (-> props
               (dissoc :value)
               (update :options #(apply array %))
               (dom/convert-props))]
         (set! (.-value js-props) value)
         (apply js/React.createElement
           Autocomplete
           js-props
           children)))))