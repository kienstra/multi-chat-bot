(ns multi-chat-bot.server
  (:require [ring.adapter.jetty :as jetty]
            [compojure.core :as comp]
            [clojure.data.json :as json]
            [multi-chat-bot.command.challenge :as challenge]
            [multi-chat-bot.command.quote :as quote]
            [multi-chat-bot.gateway.http-gateway :refer [make-http-gateway]]))

(defn command? [body] (= "2" (get body "type")))
(defn body-json [request] (json/read-str (slurp (:body request))))

(defmulti command (fn [body]
                   (get-in body ["data" "name"])))

(defmethod command "quote" [_]
  (quote/command (make-http-gateway)))

(defmethod command "challenge" [_]
  (challenge/command))

(comp/defroutes routes
  (comp/POST "/" request
    (let [body (body-json request)]
      (if
       (command? body)
        (command body)
        {:status 200
         :body   "Incorrect"}))))

(defn serve! []
  (jetty/run-jetty routes {:port 3000}))
