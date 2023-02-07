(ns ^:deprecated material-ui.surfaces.card
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/Card" :default Card]
               ["@mui/material/CardContent" :default CardContent]
               ["@mui/material/CardActions" :default CardActions]
               ["@mui/material/CardHeader" :default CardHeader]
               ["@mui/material/CardMedia" :default CardMedia]
               ["@mui/material/CardActionArea" :default CardActionArea]])))

(def card (interop/react-factory #?(:cljs Card :clj nil)))
(def content (interop/react-factory #?(:cljs CardContent :clj nil)))
(def actions (interop/react-factory #?(:cljs CardActions :clj nil)))
(def action-area (interop/react-factory #?(:cljs CardActionArea :clj nil)))
(def header (interop/react-factory #?(:cljs CardHeader :clj nil)))
(def media (interop/react-factory #?(:cljs CardMedia :clj nil)))