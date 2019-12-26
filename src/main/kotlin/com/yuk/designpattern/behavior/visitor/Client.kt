package com.yuk.designpattern.behavior.visitor

import com.yuk.designpattern.behavior.visitor.pattern.*

fun useVisitor(){
    val visitor : Visitor = ConcreateVisitor()

    var element : Element = ConcreateElementA()
    element.visit(visitor)

    element = ConcreateElementB()
    element.visit(visitor)
}