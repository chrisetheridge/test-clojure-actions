(ns foo.core)

(defn intentionally-unbalanced-stuff [x]
  (assoc {"foo" "bar"
          "unbalanced" true
          :number-that-is-unbalanced 5}
         :baz :qux))

(defn kondo-issues [x y z]
  (if x
    true))

(defn add-another-bad-fn  [b a]
  (inc 1)
  (not (empty? b)))
