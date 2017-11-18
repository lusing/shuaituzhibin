(ns .test2)
(defrecord Person [first-name last-name])

(defn hello
  [username]
  (swap! visitors conj username)
  (str "Hello," username)
  )