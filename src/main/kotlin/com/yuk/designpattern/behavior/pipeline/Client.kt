package com.yuk.designpattern.behavior.pipeline

import com.yuk.designpattern.behavior.pipeline.pattern.HandlerImpl1
import com.yuk.designpattern.behavior.pipeline.pattern.HandlerImpl2
import com.yuk.designpattern.behavior.pipeline.pattern.HandlerImpl3
import com.yuk.designpattern.behavior.pipeline.pattern.Pipeline

fun usePipeline() {
    val pipe = Pipeline(HandlerImpl1())
        .addHandler(HandlerImpl2())
        .addHandler(HandlerImpl3())

    val answer = pipe.execute("asdf")
}