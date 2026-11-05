package org.example.question01
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

fun main() = runBlocking<Unit> {
    launch {
        delay(1000L)
        println("Coffee ready")
    }
    println("Order accepted")
}