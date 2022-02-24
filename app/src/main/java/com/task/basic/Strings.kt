package com.task.basic

fun main() {
    val firstString = "Hello"
    print("Original String: $firstString , ")
    concatForString(firstString)
    println("Updated String: $firstString")

    val originalString = StringBuffer("Mobile")
    print("Original String: $originalString , ")
    concatForStringBuffer(originalString)
    println("Updated String: $originalString")

    val water = StringBuilder("Water ")
    print("Original String: $water , ")
    concatForStringBuilder(water)
    println("Updated String: $water ")
}

fun concatForString(passedString: String) {
    var secondString = passedString
    secondString += " There"
}

fun concatForStringBuffer(passedString: StringBuffer) {
    passedString.append(" Charger")
}

fun concatForStringBuilder(passedString: StringBuilder) {
    passedString.append("Bottle")
}
