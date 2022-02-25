package com.task.idioms

fun main() {
    val materials = Materials()
    println("Total Number of bottle present in the list: ${materials.differentMaterials()}")
}

class Materials {
    lateinit var bottle: ArrayList<String>

    fun differentMaterials(): Int {
        bottle = ArrayList()
        bottle.addAll(listOf("Bisleri", "Milton", "Keshri"))

        return bottle.size
    }
}