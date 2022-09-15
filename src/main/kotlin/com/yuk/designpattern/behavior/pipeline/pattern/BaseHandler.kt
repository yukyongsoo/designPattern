package com.yuk.designpattern.behavior.pipeline.pattern

interface Handler<I, O> {
    fun handle(input: I): O
}

class Pipeline<I, O>(
    private val currentHandler: Handler<I, O>
) {
    fun <K> addHandler(newHandler: Handler<O, K>): Pipeline<I, K> {
        return Pipeline(object : Handler<I, K> {
            override fun handle(input: I): K {
                return newHandler.handle(currentHandler.handle(input))
            }
        })
    }

    fun execute(input: I): O {
        return currentHandler.handle(input)
    }
}