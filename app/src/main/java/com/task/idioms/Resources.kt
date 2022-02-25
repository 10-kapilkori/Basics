package com.task.idioms

fun main() {
    val calculator = Calculator(20.75f, 2.5f)

    with(calculator) {
        println("Result for Sum: ${sum()}")
        println("Result for Sub: ${sub()}")
        println("Result for Mul: ${mul()}")
        println("Result for Div: ${div()}")
        println("Result for Mod: ${mod()}")
    }

    when ("Red") {
        "White" -> println("White")
        "Blue" -> println("It is blue")
        "Red" -> println("Found red")
        else -> println("Unknown color")
    }

    val a = (0..100).random()
    when (a) {
        in (0..50) -> println("The number is between 0 to 50")
        in (0..20) -> println("The number is between 0 to 20")
        else -> println("The number can't be found")
    }
}

class Calculator(private val firstValue: Float, private val secondValue: Float) {
    fun sum(): Int {
        return (firstValue + secondValue).toInt()
    }

    fun sub(): Int {
        return (firstValue - secondValue).toInt()
    }

    fun mul(): Float {
        return firstValue * secondValue
    }

    fun div(): Float {
        return firstValue / secondValue
    }

    fun mod(): Int {
        return (firstValue % secondValue).toInt()
    }
}