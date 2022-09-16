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

class FunctionPipeline<I, O>(
    private val currentHandler: (I) -> O
) {
    fun <K> addHandler(newHandler: (O) -> K): FunctionPipeline<I, K> {
        return FunctionPipeline { input ->
            newHandler.invoke(currentHandler.invoke(input))
        }
    }

    fun execute(input: I): O {
        return currentHandler.invoke(input)
    }
}