package org.example.question12

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun CoroutineScope.startGreeter(name: String): Job = launch {
    delay(50L)
    println("Hello, $name")
}

suspend fun greetEverybody(names: List<String>) {
    coroutineScope {
        names.forEachIndexed { index, name ->
            launch {
                delay((index + 1) * 100L)
                println("Hello, $name")
            }
        }
    }
}

fun main() = runBlocking<Unit> {
    startGreeter("Ada")
    println("After startGreeter")

    greetEverybody(listOf("Linus", "Grace"))
    println("After greetEverybody")
}