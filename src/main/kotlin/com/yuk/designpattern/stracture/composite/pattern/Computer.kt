package com.yuk.designpattern.stracture.composite.pattern

class Computer{
    private val deviceList = mutableListOf<Device>()

    fun addDevice(device: Device){
        deviceList.add(device)
    }

    fun removeDevice(device: Device){
        deviceList.remove(device)
    }

    fun shutDown(){
        deviceList.forEach {
            it.shutDown()
        }
    }
}