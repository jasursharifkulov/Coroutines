package org.example.question02

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

//fun main() = runBlocking<Unit> {
//    launch {
//        println("espresso start")
//        delay(300L)
//        println("espresso end")
//    }
//    launch {
//        println("tea start")
//        delay(100L)
//        println("tea end")
//    }
//    launch {
//        println("latte start")
//        delay(200L)
//        println("latte end")
//    }
//}

fun main() = runBlocking<Unit> {
    launch {
        println("espresso start")
        Thread.sleep(300L)
        println("espresso end")
    }
    launch {
        println("tea start")
        Thread.sleep(100L)
        println("tea end")
    }
    launch {
        println("latte start")
        Thread.sleep(200L)
        println("latte end")
    }
}