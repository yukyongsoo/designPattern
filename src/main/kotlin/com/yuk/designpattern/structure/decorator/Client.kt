package com.yuk.designpattern.structure.decorator

import com.yuk.designpattern.structure.decorator.pattern.ConcreateNavigator
import com.yuk.designpattern.structure.decorator.pattern.ConcreateNavigatorExtender1
import com.yuk.designpattern.structure.decorator.pattern.ConcreateNavigatorExtender2
import com.yuk.designpattern.structure.decorator.pattern.Navigator

fun useDecorator(){
    var navi : Navigator = ConcreateNavigator()
    navi.display()

    navi = ConcreateNavigatorExtender1(navi)
    navi.display()

    navi = ConcreateNavigatorExtender2(navi)
    navi.display()
}