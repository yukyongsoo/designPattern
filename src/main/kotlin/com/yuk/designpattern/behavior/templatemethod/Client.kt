package com.yuk.designpattern.behavior.templatemethod

import com.yuk.designpattern.behavior.templatemethod.pattern.AbstractMethod
import com.yuk.designpattern.behavior.templatemethod.pattern.ConcreateMethod1
import com.yuk.designpattern.behavior.templatemethod.pattern.ConcreateMethod2

fun useTemplateMethod(){
    var method : AbstractMethod = ConcreateMethod1()
    method.method()

    method = ConcreateMethod2()
    method.method()
}