package com.foo.controller

class HelloController {

    class Foo {
        String title
    }

    def index() {

        def results = [new Foo(title: "foo"), new Foo(title: "bar")]
        render(contentType: "application/json") {
            foos = array {
                for (b in results) {
                    foo title: b.title
                }
            }
        }

    }
}
