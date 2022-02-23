package com.task.basic

fun main() {
    val child = Child()
    child.add(32, 12)
    println()

    val vehicle = Vehicle(4)
    vehicle.hondaCity()
    vehicle.splendor()
    vehicle.bodyOfVehicle()
    println()

    val hybrid = HybridPlatform()
    hybrid.flutterLanguage()
    val native = NativePlatform()
    native.kotlinLanguage()
    println()

    val pet = Pet()
    pet.goodToHavePet()
    val cat = Cat()
    cat.about()
    cat.catBreed()
    val dog = Dog()
    dog.about()
    dog.dogBreed()
}

//  Simple Inheritance
open class Parent {
    open fun add(a: Int, b: Int) {
        println("From Parent Class")
        println("Adding two values will give: ${a + b}")
    }
}

class Child : Parent() {
    private val num = 121
    override fun add(a: Int, b: Int) {
        super.add(a, b)
        println("From Child class")
        println("A different result: ${num + a + b}")
    }
}

//  Multilevel Inheritance
class Vehicle(private val rate: Int) : Car() {
    override fun hondaCity() {
        super.hondaCity()
        println("This vehicle is rated at $rate")
    }

    override fun splendor() {
        super.splendor()
        println("This vehicle is manufactured by Hero company")
    }
}

open class Car : Body() {
    open fun hondaCity() {
        println("It is a four wheeler vehicle and uses Diesel.")
    }

    open fun splendor() {
        println("It is a two wheeler vehicle and uses petrol.")
    }
}

open class Body {
    open fun bodyOfVehicle() {
        println("It designs the body of the vehicle.")
    }
}

//  Hierarchy Inheritance
open class AndroidDevelopment {
    open fun kotlinLanguage() {
        println("For the native android application development you should use Kotlin language")
    }

    open fun flutterLanguage() {
        println("For the hybrid android application development you should use dart language")
    }
}

class HybridPlatform : AndroidDevelopment() {
    override fun flutterLanguage() {
        super.flutterLanguage()
        println("Also, you can use ReactNative for the same purpose.")
    }
}

class NativePlatform : AndroidDevelopment() {
    override fun kotlinLanguage() {
        super.kotlinLanguage()
        println("And you can also use Java as programming language")
    }
}

//  Hybrid Inheritance
class Pet : Cat() {
    fun goodToHavePet() {
        println("It is good to have pet. They keeps you busy.")
    }
}

open class Cat : Breed() {
    fun about() {
        println("Fun fact: Cats sleep for more than 12 hours.")
    }
}

class Dog : Breed() {
    fun about() {
        println("Dogs are the only animal who knows that we are pointing at something and want to show it to them")
    }
}

open class Breed {
    open fun dogBreed() {
        println("There are several breeds of dog like, GreatDane, Husky, Bulldog, Boxer etc.")
    }

    open fun catBreed() {
        println("They also have quite a kingdom of there own. Like ragdoll, european shorthair, snowshoe cat etc.")
    }
}
