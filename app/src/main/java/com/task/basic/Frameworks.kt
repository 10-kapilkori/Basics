package com.task.basic

import kotlin.collections.List

fun main() {
    val testList = TestList()
    println("Updated List After Adding :- ${testList.addOperation()}")
    println("Updated List After Removing :- ${testList.removeOperation()}")
    println("Fetching First Element from List :- ${testList.removeOperation().first()}")
    println("Fetching Last Element from List :- ${testList.removeOperation().last()}")
    testList.sortList()
    testList.iterateOverList()
    println()

    val testSet = TestSet()
    println("Updated Set After Adding :- ${testSet.addOperation()}")
    println("Total number of Set Elements :- ${testSet.countOperation()}")
    testSet.iterateOverSet()
    println()

    val testMap = TestMap()
    println("Updated Map :- ${testMap.addIntoMap()}")
    testMap.iterateOverMap()
}

class TestList {
    private val immutableList: List<Int> = listOf(12, 33, 22, 54, 65)
    private val mutableList: MutableList<Int> = mutableListOf(1, 36, 12, 4, 98)

    fun addOperation(): List<Int> {
        mutableList.add(45)
        return mutableList
    }

    fun removeOperation(): List<Int> {
        mutableList.remove(98)
        return mutableList
    }

    fun sortList() {
        mutableList.sort()
        println("Sorted List: $mutableList")
    }

    fun iterateOverList() {
        print("List From Immutable List:- ")
        for (i in immutableList) {
            print("$i ")
        }
    }
}

class TestSet {
    private val immutableSet: Set<String> = setOf("firstname", "lastname", "address", "birthdate")
    private val mutableSet: MutableSet<String> = mutableSetOf("water", "land", "fire", "wind")

    fun countOperation(): Int {
        return immutableSet.count()
    }

    fun addOperation(): Set<String> {
        mutableSet.add("lightning")
        mutableSet.add("fire")                                      // I tired to add the similar value to a set, hence it doesn't support duplicate value
        return mutableSet
    }

    fun iterateOverSet() {
        print("Values of Immutable set :- ")
        for (i in immutableSet) {
            print("$i ")
        }
    }
}

class TestMap {
    private val immutableMap: Map<Int, String> =
        mapOf(1 to "chairs", 2 to "tables", 3 to "sofas", 4 to "stools")
    private val mutableMap: MutableMap<String, String> =
        mutableMapOf("bottle" to "water", "moon" to "land", "sun" to "fire", "jet" to "wind")

    fun iterateOverMap() {
        print("Elements in the Map :- ")
        for (entry in immutableMap.keys) {
            print("$entry = ${immutableMap[entry]} ")
        }
    }

    fun addIntoMap(): Map<String, String> {
        mutableMap["clouds"] = "rain"
        return mutableMap
    }
}