package com.task.basic

fun main() {
    val a = A()
    a.test()
    val b = B()
    b.test()
}

open class AccessModifiers {
//    By default the variables are public in a class, so writing public while declaring a variable would be redundant.

    public val a = 10
    protected val b = 12
    private val c = 84
    internal val d = 93
}

open class A : AccessModifiers() {
    open fun test() {
        println("Showing that a protected variable can be inherited in the class for example the variable b's value: $b")

//        And as for the private variable we know that they are not available or accessible outside the class
//        println("It will result in compile time error, saying that the value is not accessible: ${c}")

//    Then the last one internal they are visible throughout the module
        println("Internal variable from AccessModifiers d's value: $d")
    }
}

class B: A() {
    override fun test() {
        println("Showing that public variables are accessible everywhere in this instance it is a's value: ${AccessModifiers().a}")
    }
}
