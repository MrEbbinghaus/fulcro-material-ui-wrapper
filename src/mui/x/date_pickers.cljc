(ns mui.x.date-pickers
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs
        [["@mui/x-date-pickers/LocalizationProvider" :refer [LocalizationProvider]]
         ["@mui/x-date-pickers/DateTimePicker" :refer [DateTimePicker]]
         ["@mui/x-date-pickers/DatePicker" :refer [DatePicker]]
         ["@mui/x-date-pickers/TimePicker" :refer [TimePicker]]
         ["@mui/x-date-pickers/DesktopDateTimePicker" :refer [DesktopDateTimePicker]]
         ["@mui/x-date-pickers/MobileDateTimePicker" :refer [MobileDateTimePicker]]
         ["@mui/x-date-pickers/StaticDateTimePicker" :refer [StaticDateTimePicker]]])))

(def localization-provider (interop/react-factory #?(:cljs LocalizationProvider :clj nil)))

(def date-time-picker (interop/react-factory #?(:cljs DateTimePicker :clj nil)))
(def date-picker (interop/react-factory #?(:cljs DatePicker :clj nil)))
(def time-picker (interop/react-factory #?(:cljs TimePicker :clj nil)))

(def desktop-date-time-picker (interop/react-factory #?(:cljs DesktopDateTimePicker :clj nil)))
(def mobile-date-time-picker (interop/react-factory #?(:cljs MobileDateTimePicker :clj nil)))
(def static-date-time-picker (interop/react-factory #?(:cljs StaticDateTimePicker :clj nil)))

