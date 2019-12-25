package com.yuk.designpattern.behavior.memento

class MementoTarget(var target: String) : Cloneable{
    fun print(){
        println(target)
    }

    public override fun clone(): Any {
        return MementoTarget(target)
    }
}