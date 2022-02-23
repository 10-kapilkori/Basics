package com.task.basic

fun main() {
    val child = Child()
    child.add(32, 12)
}

open class Parent {
    open fun add(a: Int, b: Int) {
        println("From Parent Class")
        println("Adding two values will give: ${a + b}")
    }
}

class Child : Parent() {
    private val num = 121
    override fun add(a: Int, b: Int) {
        super.add(a, b)
        println("From Child class")
        println("A different result: ${num + a + b}")
    }
}