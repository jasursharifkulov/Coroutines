package org.example.question07

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    println("1")

    launch {
        println("2")
        delay(100L)
        println("3")
    }

    println("4")
    delay(50L)
    println("5")
}