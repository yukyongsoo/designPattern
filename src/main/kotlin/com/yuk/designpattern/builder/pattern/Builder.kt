package com.yuk.designpattern.builder.pattern

object Builder{
    fun build() : BuilderProduct{
        return ConcreateBuilderProduct()
    }
}

