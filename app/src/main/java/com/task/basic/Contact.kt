package com.task.basic

fun main() {
    println("\t\t\t\t\tContact Application\n")

    println("Please Enter your First Name: ")
    val firstName = readLine().toString()
    println("Please Enter your Last Name: ")
    val lastName = readLine().toString()
    println("Please Enter your Phone: ")
    val phone: Long = readLine()!!.toLong()
    println("Please Enter your Email: ")
    val email = readLine().toString()

    println()

    val contact = Contact(firstName, lastName, phone, email)
    contact.details()
}

class Contact(
    private val first_name: String,
    private val last_name: String,
    private val phone: Long,
    private val email: String
) {
    fun details() {
        println("This is ${"$first_name $last_name"}, And Please feel free to contact me either via phone number i.e., $phone or email i.e., $email")
    }
}

