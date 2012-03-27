(ns drawing)

(defn ^:export test [] "Hello from draw")

(defn ^:export draw [canvas]
	(let [x (rand-int 400) y (rand-int 400)]
	(set! (.-fillStyle canvas) "rgb(200, 0, 0)")
	(. canvas fillRect x y 55 50)))
