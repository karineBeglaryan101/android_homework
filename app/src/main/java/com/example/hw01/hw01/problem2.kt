package com.example.hw01.hw01

fun main() {
    val sentence = "My favorite city is Brno!"

    val newSentence = "$sentence I love Vienna too."

    val substring = sentence.substring(0, 6)

    val uppercaseString = sentence.uppercase()
    val lowercaseString = sentence.lowercase()

    println("Original sentence: $sentence")
    println("Concatenated sentence: $newSentence")
    println("Substring: $substring")
    println("Uppercase: $uppercaseString")
    println("Lowercase: $lowercaseString")
}
