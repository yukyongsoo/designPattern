package com.yuk.designpattern.stracture.adapter.pattern

interface Adapter {
    fun request()
}

class ConcreateAdapter(
    private val adaptee: AdapteeForOldClass
) : Adapter {

    override fun request() {
        adaptee.toString()
    }
}