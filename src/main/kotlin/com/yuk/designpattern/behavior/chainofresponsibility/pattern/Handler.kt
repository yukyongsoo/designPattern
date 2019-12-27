package com.yuk.designpattern.behavior.chainofresponsibility.pattern


abstract class Handler {
    private var next: Handler? = null

    fun setNext(next: Handler) {
        this.next = next
    }

    fun handle(number: Int) { //kill point
        when {
            checkHandleAvailable(number) -> resolve(number)
            next != null -> next?.handle(number)
            else -> println("어떤 객체도 처리하지 못함")
        }
    }

    protected abstract fun checkHandleAvailable(num: Int): Boolean
    protected abstract fun resolve(num: Int)
}

class ConcreateHandler1 : Handler() {
    override fun checkHandleAvailable(num: Int): Boolean {
        return num == 1
    }

    override fun resolve(num: Int) {
        println("handler1 work")
    }
}


class ConcreateHandler2 : Handler() {
    override fun checkHandleAvailable(num: Int): Boolean {
        return num == 2
    }

    override fun resolve(num: Int) {
        println("handler2 work")
    }
}


class ConcreateHandler3 : Handler() {
    override fun checkHandleAvailable(num: Int): Boolean {
        return num == 3
    }

    override fun resolve(num: Int) {
        println("handler3 work")
    }
}