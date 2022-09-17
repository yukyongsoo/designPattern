package com.yuk.designpattern.structure.composite

import com.yuk.designpattern.structure.composite.pattern.Directory
import com.yuk.designpattern.structure.composite.pattern.File

fun useComposite(){
    val directory = Directory()
    val subDirectory = Directory()
    subDirectory.addNode(Directory())
    directory.addNode(subDirectory)
    directory.addNode(File())

    directory.getName()
}