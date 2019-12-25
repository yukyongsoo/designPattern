package com.yuk.designpattern.behavior.observer

import com.yuk.designpattern.behavior.observer.pattern.ConcreateObserver
import com.yuk.designpattern.behavior.observer.pattern.ConcreateObserver2
import com.yuk.designpattern.behavior.observer.pattern.Subject

fun useObserver(){
    val subject = Subject()
    subject.addNotifier(ConcreateObserver())
    subject.addNotifier(ConcreateObserver2())

    subject.setString()
}