package com.yuk.designpattern.structure.decorator.pattern

abstract class NavigatorExtender(private val navigator: Navigator) : Navigator{
    override fun display() {
        navigator.display()
    }
}

class ConcreateNavigatorExtender1(navigator: Navigator) : NavigatorExtender(navigator){
    override fun display() {
        super.display() //kill point
        subDisplay()
    }

    private fun subDisplay(){
        println("extender1")
    }
}


class ConcreateNavigatorExtender2(navigator: Navigator) : NavigatorExtender(navigator){
    override fun display() {
        super.display() //kill point
        subDisplay()
    }

    private fun subDisplay(){
        println("extender2")
    }
}