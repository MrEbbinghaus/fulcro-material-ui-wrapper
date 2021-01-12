(ns material-ui.data-display.table
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs
       [["@material-ui/core/Table" :default Table]
        ["@material-ui/core/TableBody" :default TableBody]
        ["@material-ui/core/TableCell" :default TableCell]
        ["@material-ui/core/TableContainer" :default TableContainer]
        ["@material-ui/core/TableFooter" :default TableFooter]
        ["@material-ui/core/TableHead" :default TableHead]
        ["@material-ui/core/TablePagination" :default TablePagination]
        ["@material-ui/core/TableRow" :default TableRow]
        ["@material-ui/core/TableSortLabel" :default TableSortLabel]])))

(def table (interop/react-factory #?(:cljs Table :clj nil)))
(def body (interop/react-factory #?(:cljs TableBody :clj nil)))
(def cell (interop/react-factory #?(:cljs TableCell :clj nil)))
(def container (interop/react-factory #?(:cljs TableContainer :clj nil)))
(def footer (interop/react-factory #?(:cljs TableFooter :clj nil)))
(def head (interop/react-factory #?(:cljs TableHead :clj nil)))
(def pagination (interop/react-factory #?(:cljs TablePagination :clj nil)))
(def row (interop/react-factory #?(:cljs TableRow :clj nil)))
(def sort-label (interop/react-factory #?(:cljs TableSortLabel :clj nil)))
