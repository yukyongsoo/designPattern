package com.yuk.designpattern.stracture.composite.pattern

interface Node {
    fun getName()
}

class File : Node {
    override fun getName() {
        println("this is File")
    }
}

class Directory : Node {
    private val nodeList = mutableListOf<Node>()

    override fun getName() {
        println("this is Directory")
        nodeList.forEach {
            it.getName()
        }
    }

    fun addNode(node: Node) {
        nodeList.add(node)
    }

    fun removeNode(node: Node) {
        nodeList.remove(node)
    }
}