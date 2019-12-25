package com.yuk.designpattern.behavior.command.pattern

interface Command{
    fun excute()
}

class ACommand(private val command : ACommandImpl) : Command{
    override fun excute() {
        command.executeA()
    }

}

class BCommand(private val command : BCommandImpl) : Command{
    override fun excute() {
        command.executeB()
    }
}