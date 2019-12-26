package com.yuk.designpattern.behavior.strategy

import com.yuk.designpattern.behavior.strategy.pattern.ConcreateStrategy1
import com.yuk.designpattern.behavior.strategy.pattern.ConcreateStrategy2
import com.yuk.designpattern.behavior.strategy.pattern.StrategyContext

fun useStrategy(){
    val context = StrategyContext()

    context.setStrategy(ConcreateStrategy1())
    context.getStrategy().useMethod()

    context.setStrategy(ConcreateStrategy2())
    context.getStrategy().useMethod()
}