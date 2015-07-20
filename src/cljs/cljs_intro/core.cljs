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
     :data #js {
        :x "x"
        :columns #js [ #js ["x" "Jan" "Feb" "Mar" "Apr" "May" "June" "July" "Aug" "Sep" "Oct" "Nov" "Dec"]
                        #js  ["Months of the year" 30 200 100 400 150 250 300 450 200 100 50 300]]
     :type "bar"}
     :bar #js {:width #js {:ratio 0.5}}
     :axis #js {:y #js {:label #js {:text "No of new signups in 2013"
                                    :position "outer-middle"
                                    :show true}
                        :show true
                        :max 400
                        :min 0}
                :x  #js {:type "category"}}}))

(defn main []
  (chart))
