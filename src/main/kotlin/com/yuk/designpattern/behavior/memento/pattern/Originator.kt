package com.yuk.designpattern.behavior.memento.pattern

import com.yuk.designpattern.behavior.memento.MementoTarget


class Originator(private var state : MementoTarget){
    fun setState(state: MementoTarget) {
        this.state = state
    }

    fun saveToMemento(): Memento {
        return Memento(this.state.clone() as MementoTarget)
    }

    class Memento(private val mementoTarget: MementoTarget) {
        fun getState() = mementoTarget
    }
}