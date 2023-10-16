package com.example.hw01.hw01

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
fun main() {
    val today = LocalDateTime.now()

    val format = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss")

    val todayInFormat = today.format(format)

    println("Date and Time: $todayInFormat")
}