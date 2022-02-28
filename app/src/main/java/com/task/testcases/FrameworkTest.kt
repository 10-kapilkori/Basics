package com.task.testcases

fun main() {
    forLists("Maki Zenin: JJK")
    forSets("hydrogen")
    forMap(105, "MNO")
}

fun forMap(key: Int, value: String) {
    val students = mutableMapOf(101 to "ABC", 102 to "DEF", 103 to "GHI", 104 to "JKL")
    students[key] = value
    students[key] = "PQRS"

    for ((rollNo, name) in students) {
        println("Roll No: $rollNo, Name: $name")
    }

    val categoryWiseChamp = linkedMapOf(
        "featherWeight" to "Deiveson Figueiredo",
        "lightWeight" to "Charles Oliveira",
        "middleWeight" to "Israel Adesanya",
        "heavyWeight" to "Ciryl Gane",
        "bantamWeight" to "Aljamain Sterling"
    )

    for (keys in categoryWiseChamp.keys) {
        print("${categoryWiseChamp[keys]} | ")
    }
}

fun forLists(anotherCharacter: String) {
    val jujutsuKaisenCharacters = mutableListOf(
        "Saturo Gojo",
        "Yuji Itadori",
        "Megumi Fushiguro",
        "Nobara Kugisaki",
        "Toge Inumaki"
    )

    if (anotherCharacter.lowercase().contains("jjk")) {
        val index = anotherCharacter.indexOf(":")
        jujutsuKaisenCharacters.add(anotherCharacter.substring(0, index))
    }

    for (i in jujutsuKaisenCharacters.indices)
        println(jujutsuKaisenCharacters[i])
}

fun forSets(anotherElement: String) {
    val atoms =
        mutableSetOf(
            "hydrogen",
            "helium",
            "neon",
            "oxygen",
            "chlorine",
            "carbon",
            "lithium",
            "magnesium"
        )
    atoms.add(anotherElement)

    for (element in atoms) {
        if (element == atoms.last())
            print(element)
        else
            print("$element, ")
    }

    val userId = sortedSetOf(112, 115, 114, 113, 110, 111)
    userId.add(116)
    println()

    for (id in userId)
        if (id == userId.last())
            print(id)
        else
            print("$id, ")
    println()
}



















