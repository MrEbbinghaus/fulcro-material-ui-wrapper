(ns material-ui.surfaces
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    [material-ui.surfaces.card :as surfaces.card]
    [material-ui.surfaces.accordion :as surfaces.accordion]
    #?@(:cljs [["@material-ui/core/Paper" :default Paper]
               ["@material-ui/core/AppBar" :default AppBar]
               ["@material-ui/core/Toolbar" :default ToolBar]])))

(def paper (interop/react-factory #?(:cljs Paper :clj nil)))
(def app-bar (interop/react-factory #?(:cljs AppBar :clj nil)))
(def toolbar (interop/react-factory #?(:cljs ToolBar :clj nil)))

(def ^:deprecated card surfaces.card/card)
(def ^:deprecated card-content surfaces.card/content)
(def ^:deprecated card-actions surfaces.card/actions)
(def ^:deprecated card-action-area surfaces.card/action-area)
(def ^:deprecated card-header surfaces.card/header)
(def ^:deprecated card-media surfaces.card/media)

(def ^:deprecated accordion surfaces.accordion/accordion)
(def ^:deprecated accordion-panel-summary surfaces.accordion/summary)
(def ^:deprecated accordion-panel-details surfaces.accordion/details)
(def ^:deprecated accordion-panel-actions surfaces.accordion/actions)

(def ^:deprecated expansion-panel surfaces.accordion/accordion)
(def ^:deprecated expansion-panel-summary surfaces.accordion/summary)
(def ^:deprecated expansion-panel-details surfaces.accordion/details)
(def ^:deprecated expansion-panel-actions surfaces.accordion/actions)
