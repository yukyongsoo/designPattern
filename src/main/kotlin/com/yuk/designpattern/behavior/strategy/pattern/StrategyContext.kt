package com.yuk.designpattern.behavior.strategy.pattern

class StrategyContext{
    private var strategy : Strategy? = null

    fun setStrategy(strategy: Strategy){
        this.strategy = strategy
    }

    fun getStrategy() = strategy ?: throw IllegalStateException("not strategy Set")
}