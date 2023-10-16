package com.example.hw01.hw01

fun main() {
    //map of my favorite books and the rating I gave them (I recommend all the books)
    val books = mapOf(
        "And every morning the way home gets longer and longer" to 10,
        "The Book Thief" to 9,
        "East of Eden" to 9.5,
        "A Movable Feast" to 8.5,
        "A man called Ove" to 9.2
    )

    for ((name, rating) in books) {
        println("Book name: $name, Rating: $rating")
    }
}