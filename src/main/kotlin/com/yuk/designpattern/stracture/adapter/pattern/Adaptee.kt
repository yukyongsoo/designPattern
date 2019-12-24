package com.yuk.designpattern.stracture.adapter.pattern

class AdapteeForOldClass

class AdapteeForNewClass : Adapter {
    override fun request() {
        println("new adapter request")
    }
}