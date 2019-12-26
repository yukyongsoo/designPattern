package com.yuk.designpattern.behavior.templatemethod.pattern

abstract class AbstractMethod{
    fun method(){
        println("use Method")
        subMethod()
    }
    protected abstract fun subMethod()
}

class ConcreateMethod1 : AbstractMethod(){
    override fun subMethod() {
        println("Concreate Method 1")
    }
}

class ConcreateMethod2 : AbstractMethod(){
    override fun subMethod() {
        println("Concreate Method 2")
    }
}