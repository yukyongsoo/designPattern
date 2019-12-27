package com.yuk.designpattern.behavior.command.pattern

class Commander(private var command: Command) {
    fun setCommand(command : Command){
        this.command = command
    }

    fun press(){
        command.execute()
    }
}