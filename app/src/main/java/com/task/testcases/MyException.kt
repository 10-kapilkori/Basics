package com.task.testcases

fun main() {
    print("Enter a name: ")
    val name = readLine() ?: ""
    try {
        validate(name)
    } catch (invalidNameException: MyException) {
        println(invalidNameException.message)
    }
}

fun validate(name: String) {
    for (i in name.indices) {
        if (name[i] in '0'..'9') {
            throw MyException("Not a name: Name cannot have integers")
        }
    }
    println("Name: $name")
}

class MyException(message: String) : Exception(message)