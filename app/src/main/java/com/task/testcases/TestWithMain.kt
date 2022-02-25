package com.task.testcases

private const val constantValue = 15

fun main() {
    println("Result :- ${main(20)}")
    println(main("This is the first word value, with a specific index passed", 6))
}

fun main(firstElement: Int): Int {
    var result: Int = firstElement * 2
    result /= constantValue
    return result
}

fun main(firstWord: String, indexValue: Int): String {
    return "This is the updated String with '${firstWord[indexValue]}' letter out with it, which was on the index: $indexValue"
}
