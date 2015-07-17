(ns cljs_intro.test-runner
  (:require
   [cljs.test :refer-macros [run-tests]]
   [cljs_intro.core-test]))

(enable-console-print!)

(defn runner []
  (if (cljs.test/successful?
       (run-tests
        'cljs_intro.core-test))
    0
    1))
