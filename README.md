# clj-tokenizer

A library which can be used for tokenizing words not separated by any separators.
Eg: "applepie" -> "apple pie"

## Installation

### Installing from Clojars

```clojure
[org.clojars.vandan/clj-tokenizer "0.1.0"]
```

### Installing from Maven

```xml
<dependency>
  <groupId>org.clojars.vandan</groupId>
  <artifactId>clj-tokenizer</artifactId>
  <version>0.1.0</version>
</dependency>
```

## Usage

clj-tokenizer contains a method tokenize which expects two arguments- the word to be tokenized and the dictionary of words which will help tokenize the text (as a set).

```clojure
  REPL> ;importing clj-tokenizer
  REPL> (use 'clj-tokenizer.core)

  REPL> ;define the dictionary used for tokenization
  REPL> (def dictionary (hash-set "apple" "pie")

  REPL> ;call tokenize method
  REPL> (tokenize "applepie" dictionary)
  "apple pie"
```

### Feel free to send issues/pull requests.

## License

Copyright © 2016 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
