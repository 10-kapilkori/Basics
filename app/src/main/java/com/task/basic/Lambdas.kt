package com.task.basic

fun main() {
    println("For Sum ")
    print("First Number:")
    val firstNum = readLine()?.toInt() ?: 0
    print("Second Number: ")
    val secondNum = readLine()?.toInt() ?: 0

    println("The sum of $firstNum and $secondNum is ${sum(firstNum, secondNum)}")

    println("For Sub ")
    print("First Number:")
    val firstNum1 = readLine()?.toInt() ?: 0
    print("Second Number: ")
    val secondNum1 = readLine()?.toInt() ?: 0

    println("The sub of $firstNum1 and $secondNum1 is ${sub(firstNum1, secondNum1)}")

    println("For Fill The Tank")
    print("The quantity of water you wanna fill: ")
    val quantity = readLine()?.toInt() ?: 100
    print("The Name of the tank you want to fill to: ")
    val name = readLine() ?: "ABC"

    println("From the info the tank result in: ${fillTheTank(quantity, name)}")
}

var sum: (Int, Int) -> Int = { a, b -> a + b }
val sub = { a: Int, b: Int -> a - b }

fun a(first: (Int, Int) -> Int): ((Int, Int) -> Int) {
    sum = first
    return sum
}

val fillTheTank: (Int, String) -> String = { quantity: Int, nameOfTank: String ->
    val text = " is filled"
    val otherText = " not is filled"

    if (quantity > 100) {
        nameOfTank.plus(text)
    } else
        nameOfTank.plus(otherText)
}
