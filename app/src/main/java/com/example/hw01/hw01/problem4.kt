package com.example.hw01.hw01

fun checkSign(number: Int): String {
    return when {
        number > 0 -> "Positive"
        number < 0 -> "Negative"
        else -> "Zero"
    }
}

fun main() {
    val number1 = 983208
    val number2 = -37597
    val number3 = 0

    val sign1 = checkSign(number1)
    val sign2 = checkSign(number2)
    val sign3 = checkSign(number3)

    println("$number1 is $sign1")
    println("$number2 is $sign2")
    println("$number3 is $sign3")
}