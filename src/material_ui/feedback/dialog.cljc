(ns ^:deprecated material-ui.feedback.dialog
  (:require
    [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
    #?@(:cljs [["@mui/material/Dialog" :default Dialog]
               ["@mui/material/DialogActions" :default DialogActions]
               ["@mui/material/DialogContent" :default DialogContent]
               ["@mui/material/DialogContentText" :default DialogContentText]
               ["@mui/material/DialogTitle" :default DialogTitle]])))

(def dialog (interop/react-factory #?(:cljs Dialog :clj nil)))
(def actions (interop/react-factory #?(:cljs DialogActions :clj nil)))
(def content (interop/react-factory #?(:cljs DialogContent :clj nil)))
(def content-text (interop/react-factory #?(:cljs DialogContentText :clj nil)))
(def title (interop/react-factory #?(:cljs DialogTitle :clj nil)))