(ns mui.lab
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    ["react" :as react]
    #?@(:cljs
        [[com.fulcrologic.fulcro.dom :as dom]
         ["@mui/material/Autocomplete" :default Autocomplete]
         ["@mui/lab/LocalizationProvider" :default LocalizationProvider]
         ["@mui/lab/DateTimePicker" :default DateTimePicker]
         ["@mui/lab/DesktopDateTimePicker" :default DesktopDateTimePicker]
         ["@mui/lab/MobileDateTimePicker" :default MobileDateTimePicker]
         ["@mui/lab/StaticDateTimePicker" :default StaticDateTimePicker]])))

(def localization-provider (interop/react-factory #?(:cljs LocalizationProvider :clj nil)))

(def date-time-picker (interop/react-factory #?(:cljs DateTimePicker :clj nil)))
(def desktop-date-time-picker (interop/react-factory #?(:cljs DesktopDateTimePicker :clj nil)))
(def mobile-date-time-picker (interop/react-factory #?(:cljs MobileDateTimePicker :clj nil)))
(def static-date-time-picker (interop/react-factory #?(:cljs StaticDateTimePicker :clj nil)))

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