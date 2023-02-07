(ns ^:deprecated material-ui.data-display.table
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs
        [["@mui/material/Table" :default Table]
         ["@mui/material/TableBody" :default TableBody]
         ["@mui/material/TableCell" :default TableCell]
         ["@mui/material/TableContainer" :default TableContainer]
         ["@mui/material/TableFooter" :default TableFooter]
         ["@mui/material/TableHead" :default TableHead]
         ["@mui/material/TablePagination" :default TablePagination]
         ["@mui/material/TableRow" :default TableRow]
         ["@mui/material/TableSortLabel" :default TableSortLabel]])))

(def table (interop/react-factory #?(:cljs Table :clj nil)))
(def body (interop/react-factory #?(:cljs TableBody :clj nil)))
(def cell (interop/react-factory #?(:cljs TableCell :clj nil)))
(def container (interop/react-factory #?(:cljs TableContainer :clj nil)))
(def footer (interop/react-factory #?(:cljs TableFooter :clj nil)))
(def head (interop/react-factory #?(:cljs TableHead :clj nil)))
(def pagination (interop/react-factory #?(:cljs TablePagination :clj nil)))
(def row (interop/react-factory #?(:cljs TableRow :clj nil)))
(def sort-label (interop/react-factory #?(:cljs TableSortLabel :clj nil)))
