package com.example.hw01.hw01

class Person(
    val name: String,
    val age: Int,
    val gender: String,
    val eyeColor: String){
    fun getLifeStage(): String {
        return when {
            age < 0 -> "Sorry but your age can't be negative."
            age < 13 -> "Child"
            age in 13..19 -> "Teenager"
            age in 20..64 -> "Adult"
            else -> "Senior"
        }
    }
}

fun main() {
    val person = Person("Ernest Hemingway", 54, "Male", "Brown")
    println("Name: ${person.name}")
    println("Age: ${person.age}")
    println("Gender: ${person.gender}")
    println("Eye Color: ${person.eyeColor}")
    println("Life Stage: ${person.getLifeStage()}")
}