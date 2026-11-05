package org.example.question15

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    println("Start")

    coroutineScope {
        launch {
            delay(300L)
            println("X")
        }

        launch {
            delay(100L)
            println("Y")
        }

        launch {
            delay(200L)
            println("Z")
        }
    }

    println("All done")
}