(ns mui.x.date-pickers
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    ["react" :as react]
    #?@(:cljs
        [[com.fulcrologic.fulcro.dom :as dom]
         ["@mui/x-date-pickers//LocalizationProvider" :default LocalizationProvider]
         ["@mui/x-date-pickers/DateTimePicker" :default DateTimePicker]
         ["@mui/x-date-pickers/DesktopDateTimePicker" :default DesktopDateTimePicker]
         ["@mui/x-date-pickers/MobileDateTimePicker" :default MobileDateTimePicker]
         ["@mui/x-date-pickers/StaticDateTimePicker" :default StaticDateTimePicker]])))

(def localization-provider (interop/react-factory #?(:cljs LocalizationProvider :clj nil)))

(def date-time-picker (interop/react-factory #?(:cljs DateTimePicker :clj nil)))
(def desktop-date-time-picker (interop/react-factory #?(:cljs DesktopDateTimePicker :clj nil)))
(def mobile-date-time-picker (interop/react-factory #?(:cljs MobileDateTimePicker :clj nil)))
(def static-date-time-picker (interop/react-factory #?(:cljs StaticDateTimePicker :clj nil)))

