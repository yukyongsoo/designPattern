package com.yuk.designpattern.objectcreate.abstractfactory

import com.yuk.designpattern.objectcreate.abstractfactory.pattern.*

fun useFactory(){
    val factory : AbstractCafeFactory = CafeAFactory()
    val productA = factory.getProductA()

    val factory2 : AbstractCafeFactory = CafeBFactory()
    val productB = factory2.getProductB()
}
