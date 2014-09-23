(defn last-el [lst] (nth lst (- (count lst) 1)))
(= (last-el [1 2 3 4 5]) 5)
(= (last-el '(5 4 3)) 3)
(= (last-el ["b" "c" "d"]) "d")
