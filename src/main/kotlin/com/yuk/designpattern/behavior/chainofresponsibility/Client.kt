package com.yuk.designpattern.behavior.chainofresponsibility

import com.yuk.designpattern.behavior.chainofresponsibility.pattern.ConcreateHandler1
import com.yuk.designpattern.behavior.chainofresponsibility.pattern.ConcreateHandler2
import com.yuk.designpattern.behavior.chainofresponsibility.pattern.ConcreateHandler3

fun useCOR(){
    val firstHandler = ConcreateHandler1()
    firstHandler.setNext(ConcreateHandler2().apply {
        setNext(ConcreateHandler3())
    })

    firstHandler.handle(1)
    firstHandler.handle(2)
    firstHandler.handle(3)
    firstHandler.handle(4)

}