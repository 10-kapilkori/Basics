package com.task.testcases

fun main() {
    var firstNumber: Int = 0
    var secondNumber: Int = 0
    var anyTest = AnyTest()

    try {
        firstNumber = readLine()?.toInt() ?: 0
        secondNumber = readLine()?.toInt() ?: 0
        anyTest = AnyTest(firstNumber, secondNumber)
    } catch (numberException: NumberFormatException) {
        println("Exception: $numberException")
    } finally {
        println(anyTest.equals(firstNumber))
        println(anyTest.hashCode())
        println(anyTest.toString())
    }
}

//  compile time and runtime error

class AnyTest(var firstNumber: Int = 0, var secondNumber: Int = 0) : Any() {
    override fun equals(other: Any?): Boolean {
        return firstNumber == other
    }

    override fun hashCode(): Int {
        return (firstNumber + secondNumber) * 18
    }

    override fun toString(): String {
        return "First Number: $firstNumber, Second Number: $secondNumber"
    }
}