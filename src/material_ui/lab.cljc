(ns material-ui.lab
  (:require
    [material-ui.feedback.skeleton :as feedback.skeleton]
    [material-ui.navigation.speed-dial :as navigation.speed-dial]
    #?@(:cljs [[com.fulcrologic.fulcro.dom :as dom]
               ["@material-ui/core/Autocomplete" :default Autocomplete]])))

(def ^:deprecated speed-dial navigation.speed-dial/speed-dial)
(def ^:deprecated speed-dial-action navigation.speed-dial/action)

(def ^:deprecated skeleton feedback.skeleton/skeleton)

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