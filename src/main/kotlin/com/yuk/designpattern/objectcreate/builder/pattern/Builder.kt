package com.yuk.designpattern.objectcreate.builder.pattern

class Builder private constructor(){
    private var text = ""
    private var number = 0

    companion object {
        fun createDefaultBuilder() = Builder()
    }

    fun setNumber(number: Int) : Builder {
        this.number = number
        return this
    }

    fun setValue(text : String) : Builder{
        this.text = text
        return this
    }

    fun build() : BuilderProduct{
        return ConcreateBuilderProduct(text,number)
    }

    private class ConcreateBuilderProduct(private val text: String,
                                          private val number: Int) : BuilderProduct {
        override fun useBuilderProduct() {
            println("this text is $text and number is $number")
        }
    }
}



