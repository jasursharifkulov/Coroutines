package org.example.question08

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val parent = launch {
        launch {
            delay(200L)
            println("child done")
        }

        println("parent body done")
    }

    parent.join()
    println("report completed")
}