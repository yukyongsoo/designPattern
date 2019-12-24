package com.yuk.designpattern.objectcreate.builder.pattern

object Builder{
    fun build() : BuilderProduct{
        return ConcreateBuilderProduct()
    }
}

