package org.example.question14

import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val job = launch {
        val result = 6 * 7
        println("Inside launch: $result")
    }

    val joinResult = job.join()
    println("join returns: $joinResult")

    val deferred = async {
        6 * 7
    }

    println("await returns: ${deferred.await()}")
}