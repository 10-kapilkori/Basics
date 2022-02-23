package com.task.basic

fun main() {
    val result1 = Polymorphism().calculateNum(23, 21)
    println("The result from Polymorphism class $result1")
    val result2 = Inheriting().calculateNum(10, 2)
    println("The result From Inheriting class $result2")
}

open class Polymorphism {
    open fun calculateNum(a: Int, b: Int): Int {
        return a + b
    }
}

class Inheriting : Polymorphism() {
    override fun calculateNum(a: Int, b: Int): Int {
        return a * b
    }
}