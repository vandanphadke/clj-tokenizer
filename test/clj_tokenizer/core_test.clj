(ns clj-tokenizer.core-test
  (:require [clojure.test :refer :all]
            [clj-tokenizer.core :refer :all]))

(deftest tokenizer-tests
  (testing "Tokenizer tests"
    (let [dictionary (hash-set "apple" "pie" "this" "is" "an")]
      (is (= "apple pie" (tokenize "applepie" dictionary)))
      (is (= "this is an apple" (tokenize "thisisanapple" dictionary))))))
