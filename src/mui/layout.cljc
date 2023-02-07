(ns mui.layout
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs
        [["@mui/material/Container" :default Container]
         ["@mui/material/Box" :default Box]
         ["@mui/material/Hidden" :default Hidden]
         ["@mui/material/ImageList" :default ImageList]
         ["@mui/material/ImageListItem" :default ImageListItem]
         ["@mui/material/ImageListItemBar" :default ImageListItemBar]
         ["@mui/material/Stack" :default Stack]])))

(def container (interop/react-factory #?(:cljs Container :clj nil)))
(def box (interop/react-factory #?(:cljs Box :clj nil)))
(def hidden (interop/react-factory #?(:cljs Hidden :clj nil)))
(def stack (interop/react-factory #?(:cljs Stack :clj nil)))

(def image-list (interop/react-factory #?(:cljs ImageList :clj nil)))
(def image-list-item (interop/react-factory #?(:cljs ImageListItem :clj nil)))
(def image-list-item-bar (interop/react-factory #?(:cljs ImageListItemBar :clj nil)))