package nested.template

class TestController {
    def bean() {
        def b = new TestBean(a: "value")
        render template: '/test/l1', bean: b
    }

    def model() {
        render template: '/test/l1', model: [a: "value"]
    }
}

class TestBean {
    String a
}
