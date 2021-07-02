(ns material-ui.lab
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs [["@material-ui/core/Pagination" :default Pagination]
              ["@material-ui/core/PaginationItem" :default PaginationItem]
              ["@material-ui/core/usePagination" :default usePagination]])))

(def pagination (interop/react-factory #?(:cljs Pagination :clj nil)))
(def item (interop/react-factory #?(:cljs PaginationItem :clj nil)))
(defn use-pagination [args] 
  #?(:cljs (usePagination (clj->js args))))