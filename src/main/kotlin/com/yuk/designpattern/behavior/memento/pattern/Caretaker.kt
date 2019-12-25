package com.yuk.designpattern.behavior.memento.pattern

import com.yuk.designpattern.behavior.memento.MementoTarget

class Caretaker {
    private val savedStates  = mutableListOf<Originator.Memento>()

    fun setState(mementoTarget: MementoTarget){
        val originator = Originator()
        originator.setState(mementoTarget.clone() as MementoTarget)
        savedStates.add(originator.saveToMemento())
    }

    fun getLastState() = savedStates.last().getState()
}