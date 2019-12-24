package com.yuk.designpattern.objectcreate.abstractfactory.pattern

interface AbstractCafeFactory {
    fun getProductA() : ProductA
    fun getProductB() : ProductB
}

class CafeAFactory : AbstractCafeFactory {
    override fun getProductA(): ProductA {
        return ConcreateCafeAProductA()
    }

    override fun getProductB(): ProductB {
        return ConcreateCafeAProductB()
    }
}

class CafeBFactory : AbstractCafeFactory {
    override fun getProductA(): ProductA {
        return ConcreateCafeAProductA()
    }

    override fun getProductB(): ProductB {
        return ConcreateCafeAProductB()
    }
}