package com.yuk.designpattern.behavior.visitor.pattern

interface Visitor{
    fun visitElementA(element : ConcreateElementA)
    fun visitElementB(element : ConcreateElementB)
}

class ConcreateVisitor : Visitor{
    override fun visitElementA(element: ConcreateElementA) {
        println("method call by visit element A")

    }

    override fun visitElementB(element: ConcreateElementB) {
        println("method call by visit element B")
    }
}