(ns foo.bad)

(def bad 1)

(defn bad-fn-impl [a b c]
  (inc a)
  (assoc-in b [:a] 1))
