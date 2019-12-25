package com.yuk.designpattern.behavior.memento.pattern

import com.yuk.designpattern.behavior.memento.MementoTarget
import com.yuk.designpattern.behavior.memento.pattern.Originator.Memento



class Originator{
    private var state : MementoTarget? = null

    fun setState(state: MementoTarget) {
        this.state = state
    }

    fun saveToMemento(): Memento {
        return Memento(this.state!!)
    }

    fun restoreFromMemento(memento: Memento) {
        this.state = memento.getState()
    }

    class Memento(private val mementoTarget: MementoTarget) {
        fun getState() = mementoTarget
    }
}