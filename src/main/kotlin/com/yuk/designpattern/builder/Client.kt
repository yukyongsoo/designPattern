package com.yuk.designpattern.builder

import com.yuk.designpattern.builder.pattern.Builder
import com.yuk.designpattern.builder.pattern.BuilderProduct

fun createProductByBuilder(): BuilderProduct {
    return Builder.build()
}

