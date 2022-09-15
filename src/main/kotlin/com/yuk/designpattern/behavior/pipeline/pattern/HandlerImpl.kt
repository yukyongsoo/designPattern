package com.yuk.designpattern.behavior.pipeline.pattern

class HandlerImpl1: Handler<String, Int> {
    override fun handle(input: String): Int {
        println("pipe1 work")
        return 1
    }
}

class HandlerImpl2: Handler<Int, Long> {
    override fun handle(input: Int): Long {
        println("pipe2 work")
        return 2
    }
}

class HandlerImpl3: Handler<Long, Char> {
    override fun handle(input: Long): Char {
        println("pipe3 work")
        return 'a'
    }
}