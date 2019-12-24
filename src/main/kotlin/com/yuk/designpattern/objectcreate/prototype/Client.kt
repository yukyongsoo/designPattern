package com.yuk.designpattern.objectcreate.prototype

import com.yuk.designpattern.objectcreate.prototype.pattern.ConcreatePrototype

fun usePrototype(){
    val clone = ConcreatePrototype().cloneForTypesafe()
}