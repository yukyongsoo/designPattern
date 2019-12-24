package com.yuk.designpattern.stracture.decorator.pattern

abstract class NavigatorExtender(private val navigator: Navigator) : Navigator{
    override fun display() {
        navigator.display()
    }
}

class ConcreateNavigatorExtender1(private val navigator: Navigator) : NavigatorExtender(navigator){
    override fun display() {
        super.display()
        subDisplay()
    }

    private fun subDisplay(){
        println("extender1")
    }
}


class ConcreateNavigatorExtender2(private val navigator: Navigator) : NavigatorExtender(navigator){
    override fun display() {
        super.display()
        subDisplay()

    }

    private fun subDisplay(){
        println("extender2")
    }
}