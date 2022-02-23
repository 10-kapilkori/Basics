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
    println("Please Enter your WorkPlace: ")
    val workPlace = readLine().toString()
    println("Please Enter your Date of Birth: ")
    val birthDate = readLine().toString()
    println("Please Enter your Date of NickName: ")
    val nickname = readLine().toString()
    println("Please Enter your Address: ")
    val address = readLine().toString()

    println()

    Contact(
        firstName,
        lastName,
        phone,
        email,
        workPlace = workPlace,
        birthDate = birthDate,
        nickname = nickname,
        address = address
    )
}

class Contact(
    first_name: String,
    last_name: String,
    phone: Long,
    email: String,
    workPlace: String = "",
    birthDate: String = "",
    nickname: String = "",
    address: String = ""
) {
    init {
        println(
            "Name: $first_name $last_name\nPhone: $phone\nEmail: $email\nWorkPlace: $workPlace\n" +
                    "BirthDate: $birthDate\nNickName: $nickname\nAddress: $address"
        )
    }
}
