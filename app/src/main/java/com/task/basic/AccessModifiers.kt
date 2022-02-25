package com.task.basic

open class Numbers {
    private fun largestNum(firstElement: Int, secondElement: Int): Int {
        return if (firstElement > secondElement)
            firstElement
        else
            secondElement
    }

    protected open fun reverseString(word: String): String {
        return "The method returns the reversed string"
    }

    internal open fun randomNumber(): Int {
//        It returns the random number
        return 0
    }

    open fun publicFunction() {
        println("This a public function which can be accessed anywhere.")
    }
}