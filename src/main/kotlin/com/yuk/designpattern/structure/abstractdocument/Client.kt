package com.yuk.designpattern.structure.abstractdocument

import com.yuk.designpattern.structure.abstractdocument.pattern.Document

fun useAbstractDocument() {
    val document = Document()
    document.put("A", "A")
    document.put("B", 1)

    document.getString("A")
    document.getInt("B")
}