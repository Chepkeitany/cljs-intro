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
     :data #js {:columns #js ["data1" 30 200 100 400 150 250 300 400 200 100 30 200]
     :types #js {:data1 "bar"} 
     :axes #js {:data1 "y"}}
     :bar #js {:width #js {:ratio 0.5}}
     :axis #js {:y #js {:label #js {:text "Signs up during the year"
                                    :position "outer-middle"
                                    :show true}}
                :x #js {:label #js {:text "Months of the year"
                                    :position "outer-middle"
                                    :show true}}}}))

(defn main []
  (chart))
