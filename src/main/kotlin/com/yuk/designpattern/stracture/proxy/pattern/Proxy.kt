package com.yuk.designpattern.stracture.proxy.pattern

interface Proxy{
    fun proxyFunction()
}

class ConcreateProxy(private val service : Service) : Proxy {
    override fun proxyFunction() {
        println("proxy called")
        service.proxyFunction()
    }

}