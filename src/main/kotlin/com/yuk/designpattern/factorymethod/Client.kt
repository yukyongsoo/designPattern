package com.yuk.designpattern.factorymethod

import com.yuk.designpattern.factorymethod.pattern.Factory

fun useFactory(factory: Factory) {
    val product = factory.getProduct()
}