package org.example.question10

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    coroutineScope {
        launch {
            delay(200L)
            println("Avatar loaded")
        }

        launch {
            delay(100L)
            println("Settings loaded")
        }
    }

    println("Profile ready")

    launch {
        println("Extra coroutine")
    }

    println("end of main")
}