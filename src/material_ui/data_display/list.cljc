(ns ^:deprecated material-ui.data-display.list
  (:refer-clojure :exclude [list])
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs
        [["@mui/material/List" :default List]
         ["@mui/material/ListItem" :default ListItem]
         ["@mui/material/ListItemText" :default ListItemText]
         ["@mui/material/ListItemIcon" :default ListItemIcon]
         ["@mui/material/ListItemAvatar" :default ListItemAvatar]
         ["@mui/material/ListItemSecondaryAction" :default ListItemSecondaryAction]
         ["@mui/material/ListSubheader" :default ListSubheader]])))

(def list ^{:arglists '({:keys [classes component dense disablePadding subheader children]} & children)} (interop/react-factory #?(:cljs List :clj nil)))
(def item ^{:arglists '({:keys [alignItems autoFocus button children ContainerComponent ContainerProps disabled divider selected classes component dense disableGutters children]} & children)} (interop/react-factory #?(:cljs ListItem :clj nil)))
(def item-text (interop/react-factory #?(:cljs ListItemText :clj nil)))
(def item-icon (interop/react-factory #?(:cljs ListItemIcon :clj nil)))
(def item-avatar (interop/react-factory #?(:cljs ListItemAvatar :clj nil)))
(def item-secondary-action (interop/react-factory #?(:cljs ListItemSecondaryAction :clj nil)))
(def subheader (interop/react-factory #?(:cljs ListSubheader :clj nil)))