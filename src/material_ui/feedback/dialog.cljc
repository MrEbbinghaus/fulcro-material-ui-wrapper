(ns material-ui.feedback.dialog
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?@(:cljs [["@material-ui/core/Dialog" :default Dialog]
              ["@material-ui/core/DialogActions" :default DialogActions]
              ["@material-ui/core/DialogContent" :default DialogContent]
              ["@material-ui/core/DialogContentText" :default DialogContentText]
              ["@material-ui/core/DialogTitle" :default DialogTitle]])))

(def dialog (interop/react-factory #?(:cljs Dialog :clj nil)))
(def actions (interop/react-factory #?(:cljs DialogActions :clj nil)))
(def content (interop/react-factory #?(:cljs DialogContent :clj nil)))
(def content-text (interop/react-factory #?(:cljs DialogContentText :clj nil)))
(def title (interop/react-factory #?(:cljs DialogTitle :clj nil)))