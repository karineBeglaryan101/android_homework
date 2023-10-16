package com.example.hw01.hw01

fun main() {
    val numbers = listOf(12, 22, 15, 16, 55, 34, 578, 2345)

    val isEven: (Int) -> Boolean = { number -> number % 2 == 0 }

    val evenNumbers = numbers.filter(isEven)

    println("Even numbers in the list:")

    evenNumbers.forEach { println(it) }
}


