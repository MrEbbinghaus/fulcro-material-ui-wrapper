(ns material-ui.layout
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs [["@material-ui/core/Container" :default Container]
              ["@material-ui/core/Box" :default Box]
              ["@material-ui/core/Hidden" :default Hidden]           
              ["@material-ui/core/ImageList" :default ImageList]
              ["@material-ui/core/ImageListItem" :default ImageListItem]
              ["@material-ui/core/ImageListItemBar" :default ImageListItemBar]])))

(def container (interop/react-factory #?(:cljs Container :clj nil)))
(def box (interop/react-factory #?(:cljs Box :clj nil)))
(def hidden (interop/react-factory #?(:cljs Hidden :clj nil)))

(def image-list (interop/react-factory #?(:cljs ImageList :clj nil)))
(def ^:deprecated grid-list image-list)
(def image-list-item (interop/react-factory #?(:cljs ImageListItem :clj nil)))
(def ^:deprecated grid-list-tile image-list-item)
(def image-list-item-bar (interop/react-factory #?(:cljs ImageListItemBar :clj nil)))
(def ^:deprecated grid-list-tile-bar image-list-item-bar)