(ns material-ui.feedback
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [
        ["@material-ui/core/LinearProgress" :default LinearProgress]
        ["@material-ui/core/Snackbar" :default Snackbar]
        ["@material-ui/core/Dialog" :default Dialog]
        ["@material-ui/core/DialogActions" :default DialogActions]
        ["@material-ui/core/DialogContent" :default DialogContent]
        ["@material-ui/core/DialogContentText" :default DialogContentText]
        ["@material-ui/core/DialogTitle" :default DialogTitle]
        ["@material-ui/core/Backdrop" :default Backdrop]])))

(def linear-progress (interop/react-factory #?(:cljs LinearProgress :clj nil)))

(def snackbar (interop/react-factory #?(:cljs Snackbar :clj nil)))

(def dialog (interop/react-factory #?(:cljs Dialog :clj nil)))
(def dialog-actions (interop/react-factory #?(:cljs DialogActions :clj nil)))
(def dialog-content (interop/react-factory #?(:cljs DialogContent :clj nil)))
(def dialog-content-text (interop/react-factory #?(:cljs DialogContentText :clj nil)))
(def dialog-title (interop/react-factory #?(:cljs DialogTitle :clj nil)))

(def backdrop (interop/react-factory #?(:cljs Backdrop :clj nil)))