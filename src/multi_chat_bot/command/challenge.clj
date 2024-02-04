(ns multi-chat-bot.command.challenge)

(defn challenges
  "Thanks to John Crickett for these challenges
   https://www.dropbox.com/scl/fi/dxlncei2xb1zzwvinjwhn/challenges.json?rlkey=9lpqz3i7mhsxsgzhwtn61weam&dl=0"
  []
  [{:name "Write Your Own wc Tool"
    :url  "https//codingchallenges.fyi/challenges/challenge-wc"}
   {:name "Write Your Own JSON Parser"
    :url  "https//codingchallenges.fyi/challenges/challenge-json-parser"}
   {:name "Write Your Own Compression Tool"
    :url  "https//codingchallenges.fyi/challenges/challenge-huffman"}
   {:name "Write Your Own cut Tool"
    :url  "https//codingchallenges.fyi/challenges/challenge-cut"}
   {:name "Write You Own Load Balancer"
    :url  "https//codingchallenges.fyi/challenges/challenge-load-balancer"}
   {:name "Write Your Own Sort Tool"
    :url  "https//codingchallenges.fyi/challenges/challenge-sort"}
   {:name "Write Your Own Calculator"
    :url  "https//codingchallenges.fyi/challenges/challenge-calculator"}
   {:name "Write Your Own Redis Server"
    :url  "https//codingchallenges.fyi/challenges/challenge-redis"}
   {:name "Write Your Own grep"
    :url  "https//codingchallenges.fyi/challenges/challenge-grep"}
   {:name "Write Your Own uniq Tool"
    :url  "https//codingchallenges.fyi/challenges/challenge-uniq"}
   {:name "Write Your Own Web Server"
    :url  "https//codingchallenges.fyi/challenges/challenge-webserver"}
   {:name "Write Your Own URL Shortener"
    :url  "https//codingchallenges.fyi/challenges/challenge-url-shortener"}
   {:name "Write Your Own diff Tool"
    :url  "https//codingchallenges.fyi/challenges/challenge-diff"}
   {:name "Write Your Own Shell"
    :url  "https//codingchallenges.fyi/challenges/challenge-shell"}
   {:name "Write Your Own cat Tool"
    :url  "https//codingchallenges.fyi/challenges/challenge-cat"}
   {:name "Write Your Own IRC Client"
    :url  "https//codingchallenges.fyi/challenges/challenge-irc"}
   {:name "Write Your Own Memcached Server"
    :url  "https//codingchallenges.fyi/challenges/challenge-memcached"}
   {:name "Write Your Own Spotify Client"
    :url  "https//codingchallenges.fyi/challenges/challenge-spotify"}])

(defn format-chal [c]
  (str (:name c) ": " (:url c)))

(defn command []
  (-> (challenges)
      first
      format-chal))
