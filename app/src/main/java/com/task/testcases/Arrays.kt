package com.task.testcases

fun main() {
    songs()
    helplineNumbers(131)
    bubbleSorting()
}

fun bubbleSorting() {
    val unsortedArray = arrayOf(45, 21, 65, 2, 98)

    println("Unsorted Array:- ${unsortedArray.toList()}")

    for (i in unsortedArray.indices) {
        for (j in i until unsortedArray.size) {
            if (unsortedArray[i] > unsortedArray[j]) {
                unsortedArray[i] = unsortedArray[i] + unsortedArray[j]
                unsortedArray[j] = unsortedArray[i] - unsortedArray[j]
                unsortedArray[i] = unsortedArray[i] - unsortedArray[j]
            }
        }
    }
    println("Sorted Array:- ${unsortedArray.toList()}")
}

fun helplineNumbers(number: Int?) {
    val contactNumber = arrayOf(100, 101, 102, 103, 131, 139)
    val contactNumberInfo = arrayOf(
        "Police",
        "Fire",
        "Ambulance",
        "Traffic Police",
        "Indian Railway General Enquiry",
        "Railway Enquiry"
    )

    when (number) {
        in contactNumber -> {
            println("Contact Number:- ${contactNumberInfo[contactNumber.indexOf(number)]}")
        }
        else -> println("Invalid helpline number passed")
    }
}

fun songs() {
    val favSong = "Senorita"
    lateinit var artist: String

    val songName = arrayOf("Willow", "Stuck with you", "Stay", "Senorita", "Believer", "Better")
    val songSangBy = arrayOf(
        "Taylor Swift",
        "Ariana Grande",
        "Justin Bieber",
        "Shawn Mendes",
        "Imagine Dragons",
        "Ananya Birla"
    )

    for (i in songSangBy.indices) {
        if (songName[i] == favSong) {
            artist = songSangBy[i]
        }
    }

    println("The Song $favSong is sang by $artist artist.")
}
