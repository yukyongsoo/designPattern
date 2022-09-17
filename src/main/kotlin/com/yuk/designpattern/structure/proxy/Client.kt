package com.yuk.designpattern.structure.proxy

import com.yuk.designpattern.structure.proxy.pattern.ConcreateProxy
import com.yuk.designpattern.structure.proxy.pattern.Proxy
import com.yuk.designpattern.structure.proxy.pattern.Service

fun useProxy(){
    val proxy : Proxy = ConcreateProxy(Service())
    proxy.proxyFunction()
}