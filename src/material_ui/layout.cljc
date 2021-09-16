(ns ^:deprecated material-ui.layout
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/Container" :default Container]
               ["@mui/material/Box" :default Box]
               ["@mui/material/Hidden" :default Hidden]
               ["@mui/material/ImageList" :default ImageList]
               ["@mui/material/ImageListItem" :default ImageListItem]
               ["@mui/material/ImageListItemBar" :default ImageListItemBar]])))

(def container (interop/react-factory #?(:cljs Container :clj nil)))
(def box (interop/react-factory #?(:cljs Box :clj nil)))
(def hidden (interop/react-factory #?(:cljs Hidden :clj nil)))

(def image-list (interop/react-factory #?(:cljs ImageList :clj nil)))
(def ^:deprecated grid-list image-list)
(def image-list-item (interop/react-factory #?(:cljs ImageListItem :clj nil)))
(def ^:deprecated grid-list-tile image-list-item)
(def image-list-item-bar (interop/react-factory #?(:cljs ImageListItemBar :clj nil)))
(def ^:deprecated grid-list-tile-bar image-list-item-bar)