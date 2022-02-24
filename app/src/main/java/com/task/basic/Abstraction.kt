package com.task.basic

fun main() {
    val androidPhones = AndroidPhones()
    androidPhones.calculator()
    androidPhones.bluetooth()
    androidPhones.calendar()
}

abstract class Mobile {
    abstract fun calendar()
    abstract fun calculator()
    abstract fun bluetooth()
}

open class AndroidPhones : Mobile() {
    override fun calendar() {
        println("Android Phones have built-in Calendar")
    }

    override fun calculator() {
        println("Android Phones have built-in Calculator")
    }

    override fun bluetooth() {
        println("Android Phones have built-in Bluetooth")
    }
}

class IPhones : Mobile() {
    override fun calendar() {
        println("IPhones have built-in Calendars")
    }

    override fun calculator() {
        println("IPhones have built-in Calculator")
    }

    override fun bluetooth() {
        println("IPhones have built-in Bluetooth")
    }
}