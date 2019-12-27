package com.yuk.designpattern.behavior.command.pattern

interface Command{
    fun execute() //kill Point
}

class ACommand(private val concreateCommand: ConcreateCommand) : Command{
    override fun execute() {
        concreateCommand.executeA()
    }

}

class BCommand(private val concreateCommand: ConcreateCommand) : Command{
    override fun execute() {
        concreateCommand.executeB()
    }

}

class ConcreateCommand {
    fun executeA(){
        println("use Command A")
    }

    fun executeB(){
        println("use Command B")
    }
}