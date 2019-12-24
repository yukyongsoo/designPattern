package com.yuk.designpattern.objectcreate.factorymethod.pattern

interface Factory {
    fun getProduct() : Product
}

class ConcreateFactory : Factory{
    override fun getProduct(): Product {
        return ConcreateProduct()
    }

}