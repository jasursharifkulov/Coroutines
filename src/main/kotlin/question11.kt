package org.example.question11

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun CoroutineScope.startCounter(
    name: String,
    limit: Int
): Job = launch {
    for (number in 1..limit) {
        delay(100L)
        println("$name: $number")
    }
}

suspend fun main() {
    coroutineScope {
        startCounter("First", 3)
        startCounter("Second", 2)
        println("launched")
    }
}