(ns material-ui.layout
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs [["@material-ui/core/Container" :default Container]
              ["@material-ui/core/Box" :default Box]
              ["@material-ui/core/Hidden" :default Hidden]           
              ["@material-ui/core/GridList" :default GridList]
              ["@material-ui/core/GridListTile" :default GridListTile]
              ["@material-ui/core/GridListTileBar" :default GridListTileBar]])))

(def container (interop/react-factory #?(:cljs Container :clj nil)))
(def box (interop/react-factory #?(:cljs Box :clj nil)))
(def hidden (interop/react-factory #?(:cljs Hidden :clj nil)))

(def grid-list (interop/react-factory #?(:cljs GridList :clj nil)))
(def grid-list-tile (interop/react-factory #?(:cljs GridListTile :clj nil)))
(def grid-list-tile-bar (interop/react-factory #?(:cljs GridListTileBar :clj nil)))