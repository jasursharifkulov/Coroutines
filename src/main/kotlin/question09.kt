package org.example.question09

import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val parent = launch {
        repeat(2) { index ->
            launch {
                try {
                    delay(1000L)
                    println("request ${index + 1} finished")
                } finally {
                    println("request ${index + 1} cleanup")
                }
            }
        }
    }

    delay(100L)
    parent.cancelAndJoin()
    println("end")
}