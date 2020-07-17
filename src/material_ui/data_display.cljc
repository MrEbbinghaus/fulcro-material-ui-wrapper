(ns material-ui.data-display
  (:refer-clojure :exclude [list])
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs
        [["@material-ui/core/List" :default List]
         ["@material-ui/core/ListItem" :default ListItem]
         ["@material-ui/core/ListItemText" :default ListItemText]
         ["@material-ui/core/ListItemIcon" :default ListItemIcon]
         ["@material-ui/core/ListItemAvatar" :default ListItemAvatar]
         ["@material-ui/core/ListItemSecondaryAction" :default ListItemSecondaryAction]
         ["@material-ui/core/Typography" :default Typography]
         ["@material-ui/core/Divider" :default Divider]
         ["@material-ui/core/Chip" :default Chip]
         ["@material-ui/core/Badge" :default Badge]
         ["@material-ui/core/Avatar" :default Avatar]])))

(def list (interop/react-factory #?(:cljs List :clj nil)))
(def list-item (interop/react-factory #?(:cljs ListItem :clj nil)))
(def list-item-text (interop/react-factory #?(:cljs ListItemText :clj nil)))
(def list-item-icon (interop/react-factory #?(:cljs ListItemIcon :clj nil)))
(def list-item-avatar (interop/react-factory #?(:cljs ListItemAvatar :clj nil)))
(def list-item-secondary-action (interop/react-factory #?(:cljs ListItemSecondaryAction :clj nil)))

(def typography (interop/react-factory #?(:cljs Typography :clj nil)))
(def divider (interop/react-factory #?(:cljs Divider :clj nil)))

(def chip (interop/react-factory #?(:cljs Chip :clj nil)))
(def badge (interop/react-factory #?(:cljs Badge :clj nil)))

(def avatar (interop/react-factory #?(:cljs Avatar :clj nil)))