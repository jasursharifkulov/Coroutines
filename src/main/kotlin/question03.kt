package org.example.question03

import kotlinx.coroutines.delay


suspend fun loadUser() {
    delay(100L)
    println("Load user")
    checkPassword()
}
suspend fun checkPassword() {
    delay(100L)
    println("Check password")
    openProfile()
}

suspend fun openProfile() {
    delay(100L)
    println("Open profile")
}

suspend fun main() {
    loadUser()
}