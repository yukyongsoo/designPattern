package com.yuk.designpattern.stracture.adapter

import com.yuk.designpattern.stracture.adapter.pattern.AdapteeForNewClass
import com.yuk.designpattern.stracture.adapter.pattern.AdapteeForOldClass
import com.yuk.designpattern.stracture.adapter.pattern.Adapter
import com.yuk.designpattern.stracture.adapter.pattern.ConcreateAdapter

fun useAdapter(){
    val adapter : Adapter = ConcreateAdapter(AdapteeForOldClass())
    adapter.toString()

    val adapter2 : Adapter = AdapteeForNewClass()
    adapter2.toString()
}
