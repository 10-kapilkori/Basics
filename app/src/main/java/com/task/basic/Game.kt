package com.task.basic

fun main() {
    val nfsGame = Game()
    nfsGame.nfsMW("2GB", "20GB", true)
    println()
    nfsGame.nfsMW("4GB", "20GB", true, "NVIDIA GTX 560")
}

class Game {
    //    The minimum requirement block
    fun nfsMW(RAM: String, spaceRequired: String, graphicsCard: Boolean) {
        println("To play NFSMW game your system should at least have RAM: $RAM, Space Required: $spaceRequired and Graphic Card: $graphicsCard")

    }

    //    For better experience block
    fun nfsMW(
        RAM: String,
        spaceRequired: String,
        graphicsCard: Boolean,
        nameOfTheGraphicCard: String
    ) {
        println("For better performance you must have RAM: $RAM, Space on your system: $spaceRequired, Graphic Card: $graphicsCard and name of it is $nameOfTheGraphicCard")
    }
}