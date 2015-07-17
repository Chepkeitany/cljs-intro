(ns cljs-intro.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(enable-console-print!)

(defonce app-state (atom {:text "Hello World!"}))

(defn chart
  "Render a bar chart using c3"
   []
  (.generate js/c3
    #js
    {:bindto "#chart"
     :data #js {:columns #js ["data1" 30 200 100 400 150 250]}}))

(defn main []
  chart
  ; (om/root
  ;   (fn [app owner]
  ;     (reify
  ;       om/IRender
  ;       (render [_]
  ;         (dom/h1 nil (:text app)))))
  ;   app-state
  ;   {:target (. js/document (getElementById "app"))})
)
