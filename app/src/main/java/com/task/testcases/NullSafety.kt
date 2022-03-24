package com.task.testcases

fun main() {
    print("Enter your age: ")
    val age: Int? = readLine()?.toInt()
    val result: String = safeCallOperator(age)
    println("The result: $result")

    print("Enter a random word: ")
    val word: String? = readLine()
    println(nullChecksOperator(word))

    print("Enter a salary: ")
    val salary: Int = readLine()?.toInt() ?: throw NumberFormatException("Invalid Number")
    println(elvisOperator(salary))
}

fun safeCallOperator(age: Int?): String {
    return if (age != null && age < 16) {
        "You are not ready to drive yet in India"
    } else if (age != null && age > 18) {
        "You are fit to drive in India"
    } else {
        throw NumberFormatException("Invalid Number")
    }
}

fun nullChecksOperator(word: String?): String {
    return if (word!!.isNotEmpty())
        "$word has the length of ${word.length}"
    else
        throw NullPointerException("Empty word")
}

fun elvisOperator(salary: Int): String {

    val result: String? = if (salary > 250000) {
        "Not a null string"
    } else
        null

    return result ?: throw NumberFormatException("A null value was returned")
}