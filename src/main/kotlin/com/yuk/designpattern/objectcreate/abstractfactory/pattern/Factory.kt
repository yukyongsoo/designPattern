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

    inner class ConcreateCafeAProductA : ProductA {
        override fun useProductA() {
            println("use productA for CafeA")
        }
    }

    inner class ConcreateCafeAProductB : ProductB {
        override fun useProductB() {
            println("use productB for CafeB")
        }
    }
}

class CafeBFactory : AbstractCafeFactory {
    override fun getProductA(): ProductA {
        return ConcreateCafeBProductA()
    }

    override fun getProductB(): ProductB {
        return ConcreateCafeBProductB()
    }

    inner class ConcreateCafeBProductA : ProductA {
        override fun useProductA() {
            println("use productA for CafeB")
        }
    }

    inner class ConcreateCafeBProductB : ProductB {
        override fun useProductB() {
            println("use ProductB for CafeB")
        }
    }
}