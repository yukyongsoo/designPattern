package com.yuk.designpattern.objectcreate.builder

import com.yuk.designpattern.objectcreate.builder.pattern.Builder
import com.yuk.designpattern.objectcreate.builder.pattern.BuilderProduct

fun createProductByBuilder(): BuilderProduct {
    return Builder.build()
}

