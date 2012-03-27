(ns drawing)

(defn ^:export test [] "Hello from draw")

(defn ^:export draw [canvas]
	(set! (.-fillStyle canvas) "rgb(200, 0, 0)")
	(. canvas fillRect 10 10 55 50))
