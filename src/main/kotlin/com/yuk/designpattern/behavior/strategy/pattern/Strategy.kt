package com.yuk.designpattern.behavior.strategy.pattern

interface Strategy{
    fun useMethod()
}

class ConcreateStrategy1 : Strategy {
    override fun useMethod() {
        println("use Strategy 1")
    }
}

class ConcreateStrategy2 : Strategy {
    override fun useMethod() {
        println("use Strategy 2")
    }
}