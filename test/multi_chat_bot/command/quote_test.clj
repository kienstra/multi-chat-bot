(ns multi-chat-bot.command.quote-test
  (:require [clojure.test :refer [deftest is testing]]
            [multi-chat-bot.command.quote :refer [command]]
            [multi-chat-bot.gateway.http-gateway :refer [IHttpGateway]]
            [multi-chat-bot.gateway.stub-response.quote :refer [has-quote no-quote]]))

(deftest quote-test
  (testing "command"
    (is (= "Your heart is the size of an ocean. Go find yourself in its hidden depths."
           (command (reify
                      IHttpGateway
                      (get-request [_ _]
                        (has-quote))
                      (post-request [_ _] {})))))
    (is (= nil
           (command (reify
                      IHttpGateway
                      (get-request [_ _]
                        (no-quote))
                      (post-request [_ _] {})))))
    (is (= nil
           (command (reify
                      IHttpGateway
                      (get-request [_ _]
                        {})
                      (post-request [_ _] {})))))
    (is (= nil
           (command (reify
                      IHttpGateway
                      (get-request [_ _]
                        "")
                      (post-request [_ _] {})))))))
