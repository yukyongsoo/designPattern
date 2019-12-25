package com.yuk.designpattern.behavior.command.pattern

class Commander {
    private var command : Command? = null

    fun setCommand(command : Command){
        this.command = command
    }

    fun press(){
        command?.excute()
    }
}