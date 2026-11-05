package org.example.question05

import kotlinx.coroutines.runBlocking

suspend fun currentThreadName(): String {
    return Thread.currentThread().name
}

fun main() = runBlocking<Unit> {
    println("Before: ${Thread.currentThread().name}")
    println("Inside suspend: ${currentThreadName()}")
}