package com.yuk.designpattern.objectcreate.builder

import com.yuk.designpattern.objectcreate.builder.pattern.Builder
import com.yuk.designpattern.objectcreate.builder.pattern.BuilderProduct

fun useBuilder() {
    val builder = Builder.createDefaultBuilder()
    val product = builder.setValue("asdf").setNumber(111).build()
    product.useBuilderProduct()
}

