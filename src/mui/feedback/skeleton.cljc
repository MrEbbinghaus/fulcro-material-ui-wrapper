(ns mui.feedback.skeleton
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/Skeleton" :default Skeleton]])))

(def ^{:arglists '({:keys [animation classes component height variant width]} & children)}
  skeleton (interop/react-factory #?(:cljs Skeleton :clj nil)))