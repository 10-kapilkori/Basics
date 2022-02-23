package com.task.basic

fun main() {

//    So here "Restaurant" is the class, and "restaurant" is the object
    val restaurant = Restaurant()
    restaurant.waitersJob(6)
}

class Restaurant {
    private val cost = 130

    fun waitersJob(quantity: Int) {
        println("First the waiter will bring the ordered Appetizer/Starters")
        println("After that he will bring the ordered Meal")
        println("Then there is always room for dessert")

        println("And at last the bill comes: ${cost * quantity}")
    }
}