(ns cljs-intro.charts)
(defn chart
	"Render a bar chart using c3"
   []
  (.generate js/c3
   	#js
   	{:bindto "#chart"
   	 :data #js {:columns #js ["data1" 30 200 100 400 150 250]
   	            :type "bar"}
     :bar #js {:width {:ratio 0.5}}}))

(defn ^:export init
 []
 (chart))