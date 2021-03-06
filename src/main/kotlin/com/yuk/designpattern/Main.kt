package com.yuk.designpattern

import com.yuk.designpattern.behavior.chainofresponsibility.useCOR
import com.yuk.designpattern.behavior.command.useCommand
import com.yuk.designpattern.behavior.memento.useMemento
import com.yuk.designpattern.behavior.visitor.useVisitor
import com.yuk.designpattern.objectcreate.abstractfactory.useAbstractFactory
import com.yuk.designpattern.objectcreate.builder.useBuilder
import com.yuk.designpattern.objectcreate.factorymethod.pattern.ConcreateFactory
import com.yuk.designpattern.objectcreate.factorymethod.useFactory
import com.yuk.designpattern.objectcreate.prototype.usePrototype

fun main() {
    //useAbstractFactory()
    //useBuilder()
    //useFactory(ConcreateFactory())
    //usePrototype()
    //useCOR()
    //useCommand()
    useMemento()
    //useVisitor()
}