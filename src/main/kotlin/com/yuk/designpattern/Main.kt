package com.yuk.designpattern

import com.yuk.designpattern.behavior.chainofresponsibility.useCOR
import com.yuk.designpattern.behavior.command.useCommand
import com.yuk.designpattern.behavior.memento.useMemento
import com.yuk.designpattern.behavior.pipeline.useFunctionPipeline
import com.yuk.designpattern.behavior.pipeline.usePipeline
import com.yuk.designpattern.behavior.visitor.useVisitor
import com.yuk.designpattern.concurrency.balking.useBalking
import com.yuk.designpattern.objectcreate.abstractfactory.useAbstractFactory
import com.yuk.designpattern.objectcreate.builder.useBuilder
import com.yuk.designpattern.objectcreate.factorymethod.pattern.ConcreateFactory
import com.yuk.designpattern.objectcreate.factorymethod.useFactory
import com.yuk.designpattern.objectcreate.prototype.usePrototype
import com.yuk.designpattern.structure.abstractdocument.useAbstractDocument

fun main() {
    //useAbstractFactory()
    //useBuilder()
    //useFactory(ConcreateFactory())
    //usePrototype()
    //useCOR()
    //useCommand()
    //useMemento()
    //useVisitor()
    //usePipeline()
    //useFunctionPipeline()
    //useBalking()
    useAbstractDocument()
}