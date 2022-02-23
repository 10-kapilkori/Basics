package com.task.basic

fun main() {
    val paymentGateway = PaymentGateway(3)

    paymentGateway.upi()
    paymentGateway.netBanking()
    paymentGateway.cashOnDelivery()
    paymentGateway.numberOfGateways()
    println("Plus u see I don't have to implement the other variable i.e., 'b' whose value is ${paymentGateway.b}")
}

interface Interfaces {
    val a: Int
    val b: Int
        get() = 1

    fun upi()
    fun netBanking()
    fun cashOnDelivery() {
        println("You have to pay when your order is delivered to you")
    }
}

class PaymentGateway(override val a: Int) : Interfaces {
    override fun upi() {
        println("One of the good method to pay to anyone using the UPI payment gateway, Though it takes sometimes extra charges while doing so")
    }

    override fun netBanking() {
        println(
            "One of the method to pay to anyone using the net banking payment gateway, " +
                    "This requires the credentials and also it blocks the user if you entered wrong user id or password more than a certain number of times"
        )
    }

    fun numberOfGateways() {
        println("Here are $a mentioned payment gateways")
    }
}