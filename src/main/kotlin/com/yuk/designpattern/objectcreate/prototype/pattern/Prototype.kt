package com.yuk.designpattern.objectcreate.prototype.pattern

interface prototype

class ConcreatePrototype : prototype, Cloneable{
    override fun clone(): Any {
        //for your copy method
        return super.clone()
    }

    fun cloneForTypesafe() : prototype{
        return clone() as prototype
    }
}