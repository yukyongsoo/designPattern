package com.yuk.designpattern.stracture.decorator

import com.yuk.designpattern.stracture.decorator.pattern.ConcreateNavigator
import com.yuk.designpattern.stracture.decorator.pattern.ConcreateNavigatorExtender1
import com.yuk.designpattern.stracture.decorator.pattern.ConcreateNavigatorExtender2
import com.yuk.designpattern.stracture.decorator.pattern.Navigator

fun useDecorator(){
    var navi : Navigator = ConcreateNavigator()
    navi.display()

    navi = ConcreateNavigatorExtender1(navi)
    navi.display()

    navi = ConcreateNavigatorExtender2(navi)
    navi.display()
}