package com.yuk.designpattern.behavior.observer.pattern

class Subject{
    private val notifiList = mutableListOf<Observer>()

    fun addNotifier(observer: Observer){
        notifiList.add(observer)
    }

    fun setString(){
        notifiAll()
    }

    fun removeNotifier(observer: Observer){
        notifiList.remove(observer)
    }

    private fun notifiAll(){
        for (observer in notifiList) {
            observer.notifi()
        }
    }
}