package com.example.hw01.hw01

fun divideNumbers(dividend: Int, divisor: Int) {
    runCatching {
        return@runCatching dividend / divisor
    }.onSuccess { result ->
        println("Result of division: $result")
    }.onFailure {
        println("Error: Division by zero is not allowed.")
    }
}

fun main() {
    print("Please enter the dividend: ")
    val dividend = readlnOrNull()?.toIntOrNull()
    print("Please enter the divisor: ")
    val divisor = readlnOrNull()?.toIntOrNull()
    if (dividend != null && divisor != null) {
        divideNumbers(dividend, divisor)
    } else {
        println("Invalid input. Please enter valid numbers.")
    }
}
