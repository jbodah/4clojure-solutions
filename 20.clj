(defn nth-last-el [n lst] (nth lst (- (count lst) n)))
(= (nth-last-el 2 (list 1 2 3 4 5)) 4)
(= (nth-last-el 2 ["a" "b" "c"]) "b")
(= (nth-last-el 2 [[1 2] [3 4]]) [1 2])
