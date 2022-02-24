package com.task.basic

interface Contact {
    fun getSavedContact(
        firstName: String,
        lastName: String,
        phone: Long,
        email: String,
        workplace: String,
        nickname: String,
        address: String,
        birthdate: String
    ): String
}

class SaveContact : Contact {

    override fun getSavedContact(
        firstName: String,
        lastName: String,
        phone: Long,
        email: String,
        workplace: String,
        nickname: String,
        address: String,
        birthdate: String
    ): String {
        return "Name: $firstName $lastName\nPhone: $phone\nEmail: $email\nWorkPlace: $workplace\n" +
                "BirthDate: $birthdate\nNickName: $nickname\nAddress: $address"
    }
}

//fun main() {
//    println("\t\t\t\t\tContact Application\n")
//
//    println("Please Enter your First Name: ")
//    val firstName = readLine().toString()
//    println("Please Enter your Last Name: ")
//    val lastName = readLine().toString()
//    println("Please Enter your Phone: ")
//    val phone: Long = readLine()!!.toLong()
//    println("Please Enter your Email: ")
//    val email = readLine().toString()
//    println("Please Enter your WorkPlace: ")
//    val workPlace = readLine().toString()
//    println("Please Enter your Date of Birth: ")
//    val birthDate = readLine().toString()
//    println("Please Enter your Date of NickName: ")
//    val nickname = readLine().toString()
//    println("Please Enter your Address: ")
//    val address = readLine().toString()
//
//    val saveContact = SaveContact()
//    val result = saveContact.getDetails(
//        firstName,
//        lastName,
//        phone,
//        email,
//        workPlace,
//        nickname,
//        address,
//        birthDate
//    )
//
//    println("\n$result")
//}
