package com.yuk.designpattern.stracture.composite

import com.yuk.designpattern.stracture.composite.pattern.Directory
import com.yuk.designpattern.stracture.composite.pattern.File

fun useComposite(){
    val directory = Directory()
    val subDirectory = Directory()
    subDirectory.addNode(Directory())
    directory.addNode(subDirectory)
    directory.addNode(File())

    directory.getName()
}