(ns multi-chat-bot.core
  (:require [multi-chat-bot.server :refer [serve!]])
  (:gen-class))

(defn -main
  []
  (serve!))
