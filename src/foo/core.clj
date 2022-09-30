(ns foo.core)

(defn intentionally-unbalanced-stuff [x]
  (assoc {"foo" "bar"
          "unbalanced" true
          :number-that-is-unbalanced 5}
         :baz :qux))

(defn foo-bar [x]
  (do
 (inc 1)
 (inc 3)
(map inc [1
	


              2



              3])))

(defn kondo-issues [x y z]
  (if x
    true))

(defn add-another-bad-fn  [b a]
  (inc 1)
  (not (empty? b)))

(defn another-bad-fn-x1 [xb]
  (assoc-in xb [:b] 2))
