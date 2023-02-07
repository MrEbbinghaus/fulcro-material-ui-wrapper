(ns ^:deprecated material-ui.lab
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/Pagination" :default Pagination]
               ["@mui/material/PaginationItem" :default PaginationItem]
               ["@mui/material/usePagination" :default usePagination]])))

(def pagination (interop/react-factory #?(:cljs Pagination :clj nil)))
(def item (interop/react-factory #?(:cljs PaginationItem :clj nil)))
(defn use-pagination [args] 
  #?(:cljs (usePagination (clj->js args))))