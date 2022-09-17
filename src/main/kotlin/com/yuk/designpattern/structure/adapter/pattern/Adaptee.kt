package com.yuk.designpattern.structure.adapter.pattern

class AdapteeForOldClass

class AdapteeForNewClass : Adapter {
    override fun request() {
        println("new adapter request")
    }
}