package com.task.testcases

import com.task.basic.Numbers
import kotlin.random.Random

fun main() {
    val fStrings = ForStrings()
    val a = fStrings.randomNumber()
    println(a)
}

class ForStrings : Numbers() {
    override fun reverseString(word: String): String {
        var character = ""
        for (i in word.length - 1 downTo 0)
            character += word[i]

        return character
    }

    override fun randomNumber(): Int {
        return (0..100).random()
    }
}