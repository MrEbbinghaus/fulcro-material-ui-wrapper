(ns material-ui.feedback.skeleton
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs [["@material-ui/core/Skeleton" :default Skeleton]])))

(def ^{:arglists '({:keys [animation classes component height variant width]} & children)}
  skeleton (interop/react-factory #?(:cljs Skeleton :clj nil)))