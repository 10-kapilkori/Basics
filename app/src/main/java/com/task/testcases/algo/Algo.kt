package com.task.testcases.algo

fun main() {
    problem()
    matrixMultiplication()

    val size = readLine()?.toInt() ?: 5

    val array: Array<Int?> = arrayOfNulls(size)
    Array(size) { index ->
        array[index] = readLine()?.toInt()
        array
    }

    sortingWithForEachIndexed(array)
}

fun matrixMultiplication() {
    print("Enter row for first matrix: ")
    val forRow1 = readLine()?.toInt()
    print("Enter column for first matrix: ")
    val forColumn1 = readLine()?.toInt()
    val firstMatrix = Array(forRow1!!) { IntArray(forColumn1!!) }

    for (i in firstMatrix.indices) {
        for (j in firstMatrix[i].indices) {
            print("Enter element position for FirstMatrix[$i][$j]: ")
            firstMatrix[i][j] = readLine()?.toInt() ?: 0
        }
    }

    println("First Entered Matrix was: ")
    for (i in firstMatrix.indices) {
        for (j in firstMatrix[i].indices) {
            print("${firstMatrix[i][j]} ")
        }
        println()
    }

    print("Enter row for second matrix: ")
    val forRow2 = readLine()?.toInt()
    print("Enter column for second matrix: ")
    val forColumn2 = readLine()?.toInt()
    val secondMatrix = Array(forRow2!!) { IntArray(forColumn2!!) }

    for (i in secondMatrix.indices) {
        for (j in secondMatrix[i].indices) {
            print("Enter element position for SecondMatrix[$i][$j]: ")
            secondMatrix[i][j] = readLine()?.toInt() ?: 0
        }
    }

    println("Second Entered Matrix was: ")
    for (i in secondMatrix.indices) {
        for (j in secondMatrix[i].indices) {
            print("${secondMatrix[i][j]} ")
        }
        println()
    }

    val resultArray = Array(firstMatrix.size) { IntArray(secondMatrix[0].size) }

    for (i in firstMatrix.indices) {
        for (j in 0 until secondMatrix[0].size) {
            resultArray[i][j] = 0
            for (k in secondMatrix.indices) {
                resultArray[i][j] += ((firstMatrix[i][k]) * (secondMatrix[k][j]))
            }
        }
    }

    println("Resulting Matrix: ")
    for (i in resultArray.indices) {
        for (j in resultArray[i].indices) {
            print("${resultArray[i][j]} ")
        }
        println()
    }
}

fun sortingWithForEachIndexed(array: Array<Int?>) {
    array.forEachIndexed { index, _ ->
        array.forEachIndexed { index2, _ ->
            if (array[index2]!! > array[index]!!) {
                val flag = array[index]
                array[index] = array[index2]
                array[index2] = flag
            }
        }
    }

    println(array.toList())
}

fun problem() {
    val arrayOfInts = intArrayOf(45, 32, 1, 54, 76)

    val evenList = mutableListOf<Int>()
    val oddList = mutableListOf<Int>()
    val halvedList = arrayOfInts.size / 2

    for (i in 0 until halvedList) {
        oddList.add(arrayOfInts[i])
    }

    for (i in arrayOfInts.size - 1 downTo halvedList) {
        evenList.add(arrayOfInts[i])
    }

    for (i in arrayOfInts.indices) {
        if (i % 2 == 0) {
            oddList.add(i, 0)
        } else {
            evenList.add(i, 0)
        }
    }

    for (i in oddList.indices) {
        if (i % 2 == 0)
            arrayOfInts[i] = evenList[i]
        else
            arrayOfInts[i] = oddList[i]
    }

    println(arrayOfInts.toList())

}



















