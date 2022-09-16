package com.yuk.designpattern.concurrency.balking

import com.yuk.designpattern.concurrency.balking.pattern.Balking

fun useBalking() {
    val balking = Balking()

    balking.run()
}