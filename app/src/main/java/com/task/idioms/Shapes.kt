package com.task.idioms

fun main() {
    val shape = Shapes(3.05F)
    println("Square: ${shape.squareArea()}")
    println("Perimeter: ${shape.perimeterOfSquare()}")
}

class Shapes(val side: Float) {
    fun squareArea(): Float {
        return (side * side)
    }
}

fun Shapes.perimeterOfSquare(): Float {
    return (4 * side)
}
