package com.yuk.designpattern.objectcreate.singleton

fun useSingleton(){
    Singleton.checkInt = 1
    println(Singleton.checkInt)

    Singleton.checkInt = 2
    println(Singleton.checkInt)
}