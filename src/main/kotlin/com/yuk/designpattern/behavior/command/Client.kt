package com.yuk.designpattern.behavior.command

import com.yuk.designpattern.behavior.command.pattern.*

fun useCommand(){
    val commander = Commander().apply {
        setCommand(ACommand(ACommandImpl()))
    }
    commander.press()

    commander.setCommand(BCommand(BCommandImpl()))
    commander.press()
}