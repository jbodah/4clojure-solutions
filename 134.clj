(true? ((fn [x y] (and (contains? y x) (= nil (get y x)))) :a {:a nil :b 2}))
(false? ((fn [x y] (and (contains? y x) (= nil (get y x)))) :b {:a nil :b 2}))
(false? ((fn [x y] (and (contains? y x) (= nil (get y x)))) :c {:a nil :b 2}))
