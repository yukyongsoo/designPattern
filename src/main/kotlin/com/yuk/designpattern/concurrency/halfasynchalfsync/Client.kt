package com.yuk.designpattern.concurrency.halfasynchalfsync

import com.yuk.designpattern.concurrency.halfasynchalfsync.pattern.AsyncService

fun useHalfService() {
    val half = AsyncService()

    half.run()
}