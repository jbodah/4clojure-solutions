; x = 0...1...2...3...
(= '(1 5 9 13 17 21 25 29 33 37) (for [x (range 40)
          :when (= 1 (rem x 4))]
    x))

; 0...4...8...12...
(= '(1 5 9 13 17 21 25 29 33 37) (for [x (iterate #(+ 4 %) 0)
        :let [z (inc x)]
        :while (< z 40)]
    z))

; (0 1) (2 3) (4 5) (6 7)...
(= '(1 5 9 13 17 21 25 29 33 37) (for [[x y] (partition 2 (range 20))]
    (+ x y)))