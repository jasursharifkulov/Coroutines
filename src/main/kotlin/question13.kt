package org.example.question13

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    val blockingResult = runBlocking {
        val job = launch {
            println("launch work")
        }

        val deferred = async {
            6 * 7
        }

        val scopeResult = coroutineScope {
            "scope value"
        }

        job.join()

        println("launch returns Job; completed=${job.isCompleted}")
        println("async returns Deferred; value=${deferred.await()}")
        println("coroutineScope returns: $scopeResult")

        "blocking value"
    }

    println("runBlocking returns: $blockingResult")
}