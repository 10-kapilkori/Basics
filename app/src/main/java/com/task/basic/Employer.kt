package com.task.basic

fun main() {
    Employer(101, "Dinesh Kumar", "Indore", 1)
    println()
    Client("Dilip Patel", "GDKN", 1)
}

class Employer(
    employer_id: Int,
    employer_name: String,
    employer_location: String,
    employer_experience: Int
) {
//    Initializer block

    init {
        println("Employer Id: $employer_id")
        println("Employer Name: $employer_name")
        println("Employer Location: $employer_location")
        println("Employer Experience: $employer_experience")
    }
}

class Client {
    private var name: String = ""

    constructor(client_name: String, client_company: String, client_bond: Int) {
        this.name = client_name

        println("Client Name: $client_name")
        println("Client Company: $client_company")
        println("Client Bond: $client_bond")
    }

    fun getClientDetails() {
        println(name)
    }
}