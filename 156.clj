(defn map-with-default [default keys] (into {} (for [x keys] {x default})))
(= (map-with-default 0 [:a :b :c]) {:a 0 :b 0 :c 0})
(= (map-with-default "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})
(= (map-with-default [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})
