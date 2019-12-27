package com.yuk.designpattern.objectcreate.factorymethod

import com.yuk.designpattern.objectcreate.factorymethod.pattern.Factory

fun useFactory(factory: Factory) {
    val product = factory.getProduct()
    product.useFactoryMethod()
}