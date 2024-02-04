(ns multi-chat-bot.gateway.http-gateway
  (:require
   [clojure.data.json :as json]))

(defprotocol IHttpGateway
  (get-request [this url])
  (post-request [this url]))

(deftype HttpGateway []
  IHttpGateway
  (get-request [_ url]
    (json/read-str (slurp url)))
  (post-request [_ _] {}))

(defn make-http-gateway []
  (->HttpGateway))
