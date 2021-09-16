(ns mui.data-display
  (:refer-clojure :exclude [list])
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs
        [["@mui/material/Typography" :default Typography]
         ["@mui/material/Divider" :default Divider]
         ["@mui/material/Chip" :default Chip]
         ["@mui/material/Badge" :default Badge]
         ["@mui/material/Avatar" :default Avatar]
         ["@mui/material/AvatarGroup" :default AvatarGroup]
         ["@mui/material/Tooltip" :default Tooltip]])))

(def typography (interop/react-factory #?(:cljs Typography :clj nil)))
(def divider (interop/react-factory #?(:cljs Divider :clj nil)))

(def chip (interop/react-factory #?(:cljs Chip :clj nil)))
(def badge (interop/react-factory #?(:cljs Badge :clj nil)))

(def avatar (interop/react-factory #?(:cljs Avatar :clj nil)))
(def avatar-group (interop/react-factory #?(:cljs AvatarGroup :clj nil)))

(def tooltip (interop/react-factory #?(:cljs Tooltip :clj nil)))
