package com.yuk.designpattern.behavior.observer.pattern

interface Observer{
    fun notifi()
}

class ConcreateObserver : Observer {
    override fun notifi() {
        println("notify1 work")
    }
}

class ConcreateObserver2 : Observer {
    override fun notifi() {
        println("notify2 work")
    }
}