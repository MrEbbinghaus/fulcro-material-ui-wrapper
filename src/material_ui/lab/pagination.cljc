(ns material-ui.lab.pagination
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs [["@material-ui/lab/Pagination" :default Pagination]
              ["@material-ui/lab/PaginationItem" :default PaginationItem]])))

(def pagination (interop/react-factory #?(:cljs Pagination :clj nil)))
(def item (interop/react-factory #?(:cljs PaginationItem :clj nil)))