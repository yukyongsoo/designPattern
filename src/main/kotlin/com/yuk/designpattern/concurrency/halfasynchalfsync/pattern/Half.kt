package com.yuk.designpattern.concurrency.halfasynchalfsync.pattern

import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.Future

class TaskHandler {
    private val queue = Executors.newSingleThreadExecutor() // ex: executorService

    fun <T> addBlockingJob(job: Callable<T>): Future<T> {
        return queue.submit(job)
    }
}

class AsyncService() {
    private val taskHandler = TaskHandler()

    fun run() {
        asyncFunction()

        val job = taskHandler.addBlockingJob {
            syncFunction()
        }

        asyncFunction2()
    }
}

fun syncFunction() {
    println("sync function")
}

fun asyncFunction() {
    println("async function1")
}

fun asyncFunction2() {
    println("async function2")
}