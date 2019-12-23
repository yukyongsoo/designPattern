package com.yuk.designpattern.abstractfactory.pattern

interface AbstractCafeFactory {
    fun getProductA() : ProductA
    fun getProductB() : ProductB
}

class CafeAFactory : AbstractCafeFactory {
    override fun getProductA(): ProductA {
        return ConcreateCafaAProductA()
    }

    override fun getProductB(): ProductB {
        return ConcreateCafaAProductB()
    }
}

class CafeBFactory : AbstractCafeFactory {
    override fun getProductA(): ProductA {
        return ConcreateCafaAProductA()
    }

    override fun getProductB(): ProductB {
        return ConcreateCafaAProductB()
    }
}