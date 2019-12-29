package com.yuk.designpattern.behavior.strategy.pattern

class StrategyContext(private var strategy: Strategy){
    fun setStrategy(strategy: Strategy){
        this.strategy = strategy
    }

    fun getStrategy() = strategy
}