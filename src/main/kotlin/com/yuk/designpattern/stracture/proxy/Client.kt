package com.yuk.designpattern.stracture.proxy

import com.yuk.designpattern.stracture.proxy.pattern.ConcreateProxy
import com.yuk.designpattern.stracture.proxy.pattern.Proxy
import com.yuk.designpattern.stracture.proxy.pattern.Service

fun useProxy(){
    val proxy : Proxy = ConcreateProxy(Service())
    proxy.proxyFunction()
}