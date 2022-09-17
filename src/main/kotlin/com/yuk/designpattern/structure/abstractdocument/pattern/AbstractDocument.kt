package com.yuk.designpattern.structure.abstractdocument.pattern

interface StringType {
    fun getString(key: String): String?
}

interface IntType {
    fun getInt(key: String): Int?
}

class Document : StringType, IntType {
    private val properties = mutableMapOf<String, Any>()

    fun put(key: String, value: Any) {
        properties[key] = value
    }

    override fun getString(key: String): String? {
        return properties[key] as String?
    }

    override fun getInt(key: String): Int? {
        return properties[key] as Int?
    }
}
