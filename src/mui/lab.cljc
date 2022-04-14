(ns mui.lab
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    [mui.x.date-pickers :as date-pickers]
    ["react" :as react]
    #?@(:cljs
        [[com.fulcrologic.fulcro.dom :as dom]
         ["@mui/material/Autocomplete" :default Autocomplete]])))

(def ^:deprecated localization-provider date-pickers/localization-provider)

(def ^:deprecated date-time-picker date-pickers/date-time-picker)
(def ^:deprecated desktop-date-time-picker date-pickers/desktop-date-time-picker)
(def ^:deprecated mobile-date-time-picker date-pickers/mobile-date-time-picker)
(def ^:deprecated static-date-time-picker date-pickers/static-date-time-picker)

(def autocomplete
  (fn [{:keys [value] :as props} & children]
    #?(:cljs
       (let [js-props
             (-> props
               (dissoc :value)
               (update :options #(apply array %))
               (dom/convert-props))]
         (set! (.-value js-props) value)
         (apply react/createElement
           Autocomplete
           js-props
           children)))))