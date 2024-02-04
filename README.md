# Multi Chat Bot

## Installation

Download from https://github.com/kienstra/multi-chat-bot

## Usage

Run the project directly, via `:exec-fn`:

    clojure -X:run-x

Run the project directly, via `:main-opts` (`-m multi-chat-bot`):

    clojure -M:run-m

Lint the project

    clojure -M:test:eastwood
    clojure -M:clj-kondo --lint src test
    clojure -M:cljfmt check

Fix formatting

    clojure -M:cljfmt check

Run the project's tests

    clojure -T:build test

Run the project's CI pipeline and build an uberjar:

    clojure -T:build ci

This will produce an updated `pom.xml` file with synchronized dependencies inside the `META-INF`
directory inside `target/classes` and the uberjar in `target`. You can update the version (and SCM tag)
information in generated `pom.xml` by updating `build.clj`.

If you don't want the `pom.xml` file in your project, you can remove it. The `ci` task will
still generate a minimal `pom.xml` as part of the `uber` task, unless you remove `version`
from `build.clj`.

Run that uberjar:

    java -jar target/net.clojars.kienstra/multi-chat-bot-0.1.0-SNAPSHOT.jar
