(ns clj-tokenizer.core)

(defn -main
  [& args])

(defmacro memoize-fn
  [fn-name & fn-args]
  `(with-local-vars
      [~fn-name (memoize
                (fn ~@fn-args))]
     (.bindRoot ~fn-name @~fn-name)
     @~fn-name))

(defn tokenize [input dict]
  (let [word-break
        (memoize-fn word-break [input]
                    (if (contains? dict input)
                      input
                      (let [length (count input)
                            candidates (map #(list (subs input 0 %) %) (range length))
                            prefixes (filter (fn [[c _]] (contains? dict c)) candidates)]
                        (last (for [[prefix i] prefixes
                                     :let [suffix (-> (subs input i length) word-break)]
                                     :when suffix]
                                 (str prefix " " suffix))))))]
    (word-break input)))
