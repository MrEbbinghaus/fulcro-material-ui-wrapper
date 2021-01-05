(ns material-ui.layout.grid
  (:require
   [com.fulcrologic.fulcro.algorithms.react-interop :as interop]
   #?(:cljs ["@material-ui/core/Grid" :default Grid])))

(def grid (interop/react-factory #?(:cljs Grid :clj nil)))

(defn container [props & children] 
  (apply grid (assoc props :container true) children))

(defn item [props & children] 
  (apply grid (assoc props :item true) children))