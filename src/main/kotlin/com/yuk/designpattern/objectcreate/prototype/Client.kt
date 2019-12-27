package com.yuk.designpattern.objectcreate.prototype

import com.yuk.designpattern.objectcreate.prototype.pattern.ConcreateSubPrototype
import com.yuk.designpattern.objectcreate.prototype.pattern.Prototype

fun usePrototype(){
   val protoType =  ConcreateSubPrototype().clone() as Prototype
    protoType.useProtoType()
}