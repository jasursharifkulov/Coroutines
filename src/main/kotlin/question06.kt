package org.example.question06

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    repeat(10) { index ->
        launch {
            val number = index + 1
            println(
                "download $number started: " +
                        Thread.currentThread().name
            )
            delay(1000L)
            println("download $number finished")
        }
    }
}