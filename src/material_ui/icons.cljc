(ns ^:deprecated material-ui.icons
  (:refer-clojure :exclude [comment remove])
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/icons/Comment" :default Comment]
               ["@mui/icons/Delete" :default Delete]
               ["@mui/icons/Menu" :default MenuIcon]
               ["@mui/icons/ExpandMore" :default ExpandMoreIcon]
               ["@mui/icons/RemoveCircle" :default RemoveCircleIcon]
               ["@mui/icons/RemoveCircleOutline" :default RemoveCircleOutlineIcon]
               ["@mui/icons/Remove" :default RemoveIcon]])))

(def comment (interop/react-factory #?(:cljs Comment :default nil)))
(def delete (interop/react-factory #?(:cljs Delete :default nil)))
(def menu (interop/react-factory #?(:cljs MenuIcon :default nil)))
(def expand-more (interop/react-factory #?(:cljs ExpandMoreIcon :default nil)))
(def remove-circle (interop/react-factory #?(:cljs RemoveCircleIcon :default nil)))
(def remove-circle-outline (interop/react-factory #?(:cljs RemoveCircleOutlineIcon :default nil)))
(def remove (interop/react-factory #?(:cljs RemoveIcon :default nil)))