package com.task.basic

fun main() {
    val os = OS()
    os.windows()
    os.macOS()
    println()
    val microsoftLap = MicrosoftLaptop()
    microsoftLap.windows()
    println()
    val macbookLap = MacBook()
    macbookLap.macOS()
}

open class OS {
    open fun macOS() {
        println("This is macOS, specifically designed to work in Apple laptops")
    }

    open fun windows() {
        println("This is windows, specifically designed to work in Microsoft, HP, Dell and other laptops")
    }
}

class MicrosoftLaptop : OS() {
    override fun windows() {
        println("Windows 11 is recently introduced, It got some amazing features.")
    }
}

class MacBook : OS() {
    override fun macOS() {
        println("Apple will be launching macOS 13, this year. They are also about to announce a new MacBook with M2 chip.")
    }
}