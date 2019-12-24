package com.yuk.designpattern.factorymethod.pattern

interface Factory {
    fun getProduct() : Product
}

class ConcreateFactory : Factory{
    override fun getProduct(): Product {
        return ConcreateProduct()
    }

}