package com.yuk.designpattern.objectcreate.abstractfactory

import com.yuk.designpattern.objectcreate.abstractfactory.pattern.*

fun useAbstractFactory(){
    val factory : AbstractCafeFactory = CafeAFactory()
    var productA = factory.getProductA()
    var productB = factory.getProductB()
    productA.useProductA()
    productB.useProductB()

    val factory2 : AbstractCafeFactory = CafeBFactory()
    productA = factory2.getProductA()
    productB = factory2.getProductB()
    productA.useProductA()
    productB.useProductB()
}
