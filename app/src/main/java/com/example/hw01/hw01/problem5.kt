package com.example.hw01.hw01

fun main() {
    print("Please enter your name: ")
    val name = readlnOrNull()

    print("Please enter your age: ")
    val age = readlnOrNull()?.toIntOrNull()

    if (age != null) {
        println("Hello, $name! My name is Karine I am very happy to get to know you!")
        when {
            age < 0 -> println("Sorry but your age can't be negative.")
            age < 10 -> println("You are still a child go play some games outside.")
            age in 11..20 -> println("I am scared of teenagers, enjoy all the emotions.")
            age in 21..64 -> println("How's the 9 to 5 job going?")
            else -> println("Wow I can't wait to be your age.")
        }
    } else {
        println("Invalid age input. Please enter a valid number.")
    }
}