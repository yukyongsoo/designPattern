package com.yuk.designpattern.stracture.composite.pattern

interface Node {
    fun addNode(node: Node)
    fun removeNode(node: Node)
    fun getName()
}

class File : Node {
    override fun addNode(node: Node) {}

    override fun removeNode(node: Node) {}

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

    override fun addNode(node: Node) {
        nodeList.add(node)
    }

    override fun removeNode(node: Node) {
        nodeList.remove(node)
    }
}