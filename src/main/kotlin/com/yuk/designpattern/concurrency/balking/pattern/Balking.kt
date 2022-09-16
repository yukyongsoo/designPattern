package com.yuk.designpattern.concurrency.balking.pattern

class Balking {
    private var run = false

    fun run() {
        synchronized(this) {
            if (run)
                return

            run = true

            println("run function")

            stop()
        }
    }

    @Synchronized
    fun stop() {
        run = false
    }
}