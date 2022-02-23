package com.task.basic

fun main() {
    val phonePe = PhonePe()
    println(
        "The amount will be deducted for booking railway ticket using UPI with PhonePe is ${
            phonePe.upi(
                270
            )
        }"
    )

    println(
        "The amount will be deducted for booking railway ticket using Citrus Pay with PhonePe is ${
            phonePe.citrusPay(
                270
            )
        }"
    )
}

interface PaymentGateway {
    fun upi(amount: Int): Float
    fun citrusPay(amount: Int): Float
}

class PhonePe : PaymentGateway {
    override fun upi(amount: Int): Float {
        return amount + 15.75f
    }

    override fun citrusPay(amount: Int): Float {
        return amount + 10.50f
    }
}