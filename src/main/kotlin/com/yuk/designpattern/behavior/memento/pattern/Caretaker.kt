package com.yuk.designpattern.behavior.memento.pattern

import java.util.*

class Caretaker {
    private val savedStates  = Stack<Originator.Memento>()

    fun setState(memento: Originator.Memento){
        savedStates.push(memento)
    }

    fun getLastState() = savedStates.pop() ?: throw IllegalStateException("caretaker has not memento")
}