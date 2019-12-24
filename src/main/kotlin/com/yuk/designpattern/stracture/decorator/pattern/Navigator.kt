package com.yuk.designpattern.stracture.decorator.pattern

interface Navigator{
    fun display()
}

class ConcreateNavigator : Navigator {
    override fun display() {
        println("display normal")
    }
}

