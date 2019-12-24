package com.yuk.designpattern.stracture.composite

import com.yuk.designpattern.stracture.composite.pattern.Computer
import com.yuk.designpattern.stracture.composite.pattern.ConcreateDevice1
import com.yuk.designpattern.stracture.composite.pattern.ConcreateDevice2

fun useComposite(){
    val computer = Computer()
    computer.addDevice(ConcreateDevice1())
    computer.addDevice(ConcreateDevice2())

    computer.shutDown()
}