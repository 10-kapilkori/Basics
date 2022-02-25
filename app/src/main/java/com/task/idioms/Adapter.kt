package com.task.idioms

fun main() {
    println(Adapter.toString())
    println(Adapter.toString())

    val adapter = Adapter
    println("This is the adapter of ${adapter.laptopAdapter}")
}

object Adapter {
    const val laptopAdapter: String = "ASUS"
}