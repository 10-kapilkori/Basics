package com.task.testcases

fun main() {
    var word = "Philadelphia"
    word = "Full creative"
    val anotherWord = word
    val secondWord = StringBuffer(word)
    val thirdWord = StringBuilder(word)

    forPalindromeString(word)
    forStringBuffer(secondWord)
    forStringBuilder(thirdWord)
}

fun forStringBuffer(word: StringBuffer) {
    val startTime = System.currentTimeMillis()
    for (i in 1 until 1000000) {
        word.append((0..100000).random())
        word.append(" ")
    }

    println("The total time taken by the String Buffer: ${System.currentTimeMillis() - startTime}ms")
}

fun forStringBuilder(word: StringBuilder) {
    val startTime = System.currentTimeMillis()
    for (i in 1 until 1000000) {
        word.append((0..100000).random())
        word.append(" ")
    }

    println("The total time taken by the String Buffer: ${System.currentTimeMillis() - startTime}ms")
}

fun forPalindromeString(word: String) {
    var reversed = ""
    for (i in word.length downTo 0) {
        reversed += word[i]
    }
    if (reversed == word)
        println("The string is Palindrome String")
    else
        println("The string is not Palindrome")
}

//Exception handling