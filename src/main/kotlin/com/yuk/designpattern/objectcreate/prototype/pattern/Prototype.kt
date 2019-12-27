package com.yuk.designpattern.objectcreate.prototype.pattern

open class Prototype : Cloneable {
    public override fun clone(): Any {
        //for your copy method
        return super.clone()
    }

    fun useProtoType() {
        println("this is ProtoType object")
    }
}

class ConcreateSubPrototype : Prototype() {
    fun useSubType() {
        println("this is Copy From ProtoType object")
    }
}