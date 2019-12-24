package com.yuk.designpattern.stracture.composite.pattern

interface Device {
    fun shutDown()
}

interface SpecificDevice {
    fun notUse()
}

class ConcreateDevice1 : Device, SpecificDevice {
    override fun notUse() {
        println("unavailable by Composite Pattern")
    }

    override fun shutDown() {
        println("device1 Down")
    }
}

class ConcreateDevice2 : Device {
    override fun shutDown() {
        println("device2 Down")
    }
}
