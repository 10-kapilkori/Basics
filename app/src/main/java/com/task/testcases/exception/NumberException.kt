package com.task.testcases.exception

import java.lang.ArithmeticException

fun main() {
    usingTryCatch()
    usingThrowKeyword()
}
//throw and throws

fun usingTryCatch() {
    try {
        print("Enter size of array: ")
        val size = readLine()?.toInt() ?: 0
        val arrayOfInts = arrayOfNulls<Int>(size)
        println("Enter the elements: ")
        Array(size) {
            arrayOfInts[it] = readLine()?.toInt()
            arrayOfInts
        }

        println("The Enter Array: ${arrayOfInts.toList()}")
        print("Enter the index value for element: ")
        val index = readLine()?.toInt() ?: 0
        println("The value at index $index is ${arrayOfInts[index]}")
    } catch (numberException: NumberFormatException) {
        println("Exception with: ${numberException.message}")
    } catch (arrayBoundException: ArrayIndexOutOfBoundsException) {
        println("Exception with: $arrayBoundException")
    } catch (nullException: NullPointerException) {
        println("Exception with: $nullException")
    }
}

fun usingThrowKeyword(): String {
    print("Enter your age: ")
    val age = readLine()?.toInt() ?: 0

    return if (age > 18)
        "You are eligible to vote"
    else
        throw ArithmeticException("You're not eligible to vote")
}

@Throws(IllegalArgumentException::class)
fun usingThrowsNotation(character: Char): String {
    if (character in ('a'..'z')) {
        return "The character is in range"
    } else {
        throw IllegalArgumentException("Invalid Character")
    }
}
