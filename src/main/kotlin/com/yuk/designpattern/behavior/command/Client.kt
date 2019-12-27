package com.yuk.designpattern.behavior.command

import com.yuk.designpattern.behavior.command.pattern.*

fun useCommand(){
    val concreateCommand = ConcreateCommand()

    val commander = Commander(ACommand(concreateCommand))
    commander.press()

    commander.setCommand(BCommand(concreateCommand))
    commander.press()
}