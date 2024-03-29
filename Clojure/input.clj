(ns input
  (:require [clojure.string :refer [split-lines]]))

(defn f->str [day] (->> day (str "input/") slurp))
(defn f->lines [day] (->> day f->str split-lines))
(defn lines [s] (split-lines s))
(defn nums [s] (->> s (re-seq #"-?\d+") (mapv parse-long)))
(defn f->nums [day] (->> day f->str nums))
(defn words [s] (re-seq #"\w+" s))
