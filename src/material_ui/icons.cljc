(ns material-ui.icons
  (:refer-clojure :exclude [comment remove])
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@material-ui/icons/Comment" :default Comment]
               ["@material-ui/icons/Delete" :default Delete]
               ["@material-ui/icons/Menu" :default MenuIcon]
               ["@material-ui/icons/ExpandMore" :default ExpandMoreIcon]
               ["@material-ui/icons/RemoveCircle" :default RemoveCircleIcon]
               ["@material-ui/icons/RemoveCircleOutline" :default RemoveCircleOutlineIcon]
               ["@material-ui/icons/Remove" :default RemoveIcon]])))

(def comment (interop/react-factory #?(:cljs Comment :default nil)))
(def delete (interop/react-factory #?(:cljs Delete :default nil)))
(def menu (interop/react-factory #?(:cljs MenuIcon :default nil)))
(def expand-more (interop/react-factory #?(:cljs ExpandMoreIcon :default nil)))
(def remove-circle (interop/react-factory #?(:cljs RemoveCircleIcon :default nil)))
(def remove-circle-outline (interop/react-factory #?(:cljs RemoveCircleOutlineIcon :default nil)))
(def remove (interop/react-factory #?(:cljs RemoveIcon :default nil)))