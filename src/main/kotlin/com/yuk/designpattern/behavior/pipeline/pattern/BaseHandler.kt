package com.yuk.designpattern.behavior.pipeline.pattern

interface Handler<I, O> {
    fun handle(input: I): O
}

class Pipeline<I, O>(
    private val currentHandler: Handler<I, O>
) {
    fun <K> addHandler(newHandler: Handler<O, K>): Pipeline<O, K> {
        return Pipeline({ input -> newHandler.handle(currentHandler.handle(input)) })
    }

    fun execute(input: I): O {
        return currentHandler.handle(input)
    }
}