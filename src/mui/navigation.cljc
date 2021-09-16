(ns mui.navigation
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/Drawer" :default Drawer]
               ["@mui/material/SwipeableDrawer" :default SwipeableDrawer]
               ["@mui/material/Menu" :default Menu]
               ["@mui/material/MenuItem" :default MenuItem]
               ["@mui/material/MenuList" :default MenuList]
               ["@mui/material/Link" :default Link]
               ["@mui/material/BottomNavigation" :default BottomNavigation]
               ["@mui/material/BottomNavigationAction" :default BottomNavigationAction]
               ["@mui/material/Breadcrumbs" :default Breadcrumbs]])))


(def drawer (interop/react-factory #?(:cljs Drawer :clj nil)))
(def swipeable-drawer (interop/react-factory #?(:cljs SwipeableDrawer :clj nil)))

(def menu (interop/react-factory #?(:cljs Menu :clj nil)))
(def menu-item (interop/react-factory #?(:cljs MenuItem :clj nil)))
(def menu-link (interop/react-factory #?(:cljs MenuList :clj nil)))


(def bottom-navigation (interop/react-factory #?(:cljs BottomNavigation :clj nil)))
(def bottom-navigation-action (interop/react-factory #?(:cljs BottomNavigationAction :clj nil)))
(def link (interop/react-factory #?(:cljs Link :clj nil)))

(def breadcrumbs (interop/react-factory #?(:cljs Breadcrumbs :clj nil)))
