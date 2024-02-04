(ns multi-chat-bot.command.challenge-test
  (:require [clojure.test :refer [deftest is testing]]
            [multi-chat-bot.command.challenge :refer [command]]))

(deftest challenge-test
  (testing "challenge"
    (is (.contains (command) "Write Your Own wc Tool"))
    (is (.contains (command) "https//codingchallenges.fyi/challenges/challenge-wc"))))
