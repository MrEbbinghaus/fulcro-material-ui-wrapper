(ns material-ui.data-display
  (:refer-clojure :exclude [list])
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs
        [["@material-ui/core/Typography" :default Typography]
         ["@material-ui/core/Divider" :default Divider]
         ["@material-ui/core/Chip" :default Chip]
         ["@material-ui/core/Badge" :default Badge]
         ["@material-ui/core/Avatar" :default Avatar]
         ["@material-ui/lab/AvatarGroup" :default AvatarGroup]
         ["@material-ui/core/Tooltip" :default Tooltip]])))

(def typography (interop/react-factory #?(:cljs Typography :clj nil)))
(def divider (interop/react-factory #?(:cljs Divider :clj nil)))

(def chip (interop/react-factory #?(:cljs Chip :clj nil)))
(def badge (interop/react-factory #?(:cljs Badge :clj nil)))

(def avatar (interop/react-factory #?(:cljs Avatar :clj nil)))
(def avatar-group (interop/react-factory #?(:cljs AvatarGroup :clj nil)))

(def tooltip (interop/react-factory #?(:cljs Tooltip :clj nil)))
