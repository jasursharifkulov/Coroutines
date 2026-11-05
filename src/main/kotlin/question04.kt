package org.example.question04

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun loadUser() {
    delay(100L)
    println("Load user")
}
//suspend fun main() {
//    loadUser()
//}
fun main() = runBlocking {
    loadUser()
}