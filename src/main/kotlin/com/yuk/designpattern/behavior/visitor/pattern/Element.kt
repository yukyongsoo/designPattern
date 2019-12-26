package com.yuk.designpattern.behavior.visitor.pattern

interface Element{
    fun visit(visitor: Visitor)
}

class ConcreateElementA : Element {
    override fun visit(visitor: Visitor) {
        visitor.visitElementA(this)
    }
}

class ConcreateElementB: Element {
    override fun visit(visitor: Visitor) {
        visitor.visitElementB(this)
    }
}

