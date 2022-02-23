package com.task.basic

fun main() {
    val a = 10
    val b = 2

    println("The value of the Sum operation is: ${Sum().calculate(a, b)}")
    println("The value of the Sub operation is: ${Sub().calculate(a, b)}")
    println("The value of the Mul operation is: ${Mul().calculate(a, b)}")
    println("The value of the Div operation is: ${Div().calculate(a, b)}")
    println("The value of the Mod operation is: ${Mod().calculate(a, b)}")
}

abstract class Calculations {
    abstract fun calculate(a: Int, b: Int): Int
}

class Sum : Calculations() {
    override fun calculate(a: Int, b: Int): Int {
        return a + b
    }
}

class Sub : Calculations() {
    override fun calculate(a: Int, b: Int): Int {
        return a - b
    }
}

class Mul : Calculations() {
    override fun calculate(a: Int, b: Int): Int {
        return a * b
    }
}

class Div : Calculations() {
    override fun calculate(a: Int, b: Int): Int {
        return a / b
    }
}

class Mod : Calculations() {
    override fun calculate(a: Int, b: Int): Int {
        return a % b
    }
}