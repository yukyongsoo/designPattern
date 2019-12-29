package com.yuk.designpattern.behavior.memento

import com.yuk.designpattern.behavior.memento.pattern.Caretaker
import com.yuk.designpattern.behavior.memento.pattern.Originator

fun useMemento(){
    val caretaker = Caretaker()
    val target = MementoTarget("target1")
    val originator = Originator(target)
    caretaker.setState(originator.saveToMemento())

    target.target = "target2"
    caretaker.setState(originator.saveToMemento())

    target.target = "target3"
    target.print()

    var memento  = caretaker.getLastState()
    memento.getState().print()

    memento = caretaker.getLastState()
    memento.getState().print()
}