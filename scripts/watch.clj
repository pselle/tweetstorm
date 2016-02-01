(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'tweetstorm.core
   :output-to "out/tweetstorm.js"
   :output-dir "out"})
