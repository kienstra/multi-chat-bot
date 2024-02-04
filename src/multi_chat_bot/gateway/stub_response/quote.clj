(ns multi-chat-bot.gateway.stub-response.quote)

(defn has-quote []
  {"quotes" [{"id"     1
              "quote"  "Your heart is the size of an ocean. Go find yourself in its hidden depths."
              "author" "Rumi"}
             {"id"     2
              "quote"  "The Bay of Bengal is hit frequently by cyclones. The months of November and May, in particular, are dangerous in this regard."
              "author" "Abdul Kalam"}]
   "total"  1454
   "skip"   0
   "limit"  30})

(defn no-quote []
  {"quotes" []
   "total"  0
   "skip"   0
   "limit"  30})
