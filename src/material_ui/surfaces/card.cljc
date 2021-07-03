(ns material-ui.surfaces.card
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@material-ui/core/Card" :default Card]
               ["@material-ui/core/CardContent" :default CardContent]
               ["@material-ui/core/CardActions" :default CardActions]
               ["@material-ui/core/CardHeader" :default CardHeader]
               ["@material-ui/core/CardMedia" :default CardMedia]
               ["@material-ui/core/CardActionArea" :default CardActionArea]])))

(def card (interop/react-factory #?(:cljs Card :clj nil)))
(def content (interop/react-factory #?(:cljs CardContent :clj nil)))
(def actions (interop/react-factory #?(:cljs CardActions :clj nil)))
(def action-area (interop/react-factory #?(:cljs CardActionArea :clj nil)))
(def header (interop/react-factory #?(:cljs CardHeader :clj nil)))
(def media (interop/react-factory #?(:cljs CardMedia :clj nil)))