package com.task.basic

//lambda function
fun main() {
//    2D array, multiply matrix example with 2/3 - 3/4 matrix
    println("Enter the Size: ")
    val size = readLine()?.toInt() ?: 5
    println("Enter String Type elements: ")
    val elements: Array<String> = Array(size) {
        readLine() ?: ""
    }

    val outputArray = customArray(*elements)
    println(outputArray.toList())

    println("Type Int Type Elements: ")
    val intElements: Array<Int> = Array(size) {
        readLine()?.toInt() ?: 0
    }

    val outputIntArray = customArray(*intElements)
    println(outputIntArray.toList())

    println("Type Float Type Elements: ")
    val floatElements: Array<Float> = Array(size) {
        readLine()?.toFloat() ?: 0.0f
    }

    val outputFloatArray = customArray(*floatElements)
    println(outputFloatArray.toList())
}

fun customArray(vararg elements: Any): Array<Any> {
    return Array(elements.size) {
        elements[it]
        elements
    }
}
