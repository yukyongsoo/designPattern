package com.yuk.designpattern.structure.adapter

import com.yuk.designpattern.structure.adapter.pattern.AdapteeForNewClass
import com.yuk.designpattern.structure.adapter.pattern.AdapteeForOldClass
import com.yuk.designpattern.structure.adapter.pattern.Adapter
import com.yuk.designpattern.structure.adapter.pattern.ConcreateAdapter

fun useAdapter(){
    val adapter : Adapter = ConcreateAdapter(AdapteeForOldClass())
    adapter.toString()

    val adapter2 : Adapter = AdapteeForNewClass()
    adapter2.toString()
}
