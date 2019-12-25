package com.yuk.designpattern.behavior.memento

import com.yuk.designpattern.behavior.memento.pattern.Caretaker

fun useMemento(){
    val caretaker = Caretaker()

    val target = MementoTarget("target1")
    caretaker.setState(target)
    target.print()

    target.target = "target2"
    target.print()

    caretaker.getLastState().print()
}