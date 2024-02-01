(ns multi-chat-bot.command.quote)

(defn command [http-gateway]
  (-> http-gateway
      (.get-request "https://dummyjson.com/quotes")
      (get "quotes")
      first
      (get "quote")))
