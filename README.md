question 1

Order accepted
Coffee ready

at frist program shows **order accepted** then after delay shows **coffee ready**

question 2

espresso start
tea start
latte start
tea end
latte end
espresso end    `with delay()`

espresso start
espresso end
tea start
tea end
latte start
    latte end       with `thread.sleep()`

delay suspends only the current coroutine
`Thread.sleep()` blocks the thread, so the second coroutine cannot start until the first finishes

question 3

Load user
Check password
Open profile

loadUser() calls checkPassword(), which calls openProfile(). Each delay suspends execution temporarily but does not change the order of the calls

question 4

LoadUser 

`suspend` fun main() allows suspend functions to be called directly. A call such as `delay() `suspends the coroutine without blocking its thread.
runBlocking allows normal code to call suspend functions, but blocks the calling thread until all work inside finishes. On Android’s UI thread, this can freeze the interface.


question 5
`suspend` does not change the thread. Both calls show the same thread name. The compiler adds a `Continuation` parameter to resume the function.

question 6
All downloads start before any finishes. This is concurrency because they share one thread. `delay` lets other coroutines run while one waits.

question 7
The order is 1, 4, 2, 5, 3. `launch` schedules the coroutine, while the main body continues until it suspends.

question 8
The parent waits for its child. Therefore, `join()` finishes after the child, and “report completed” is printed last.

question 9
Cancelling the parent cancels both children. Their `finally` blocks print cleanup messages before “end”.

question 10
`coroutineScope` waits for both loading tasks. The later `launch` returns immediately, so “end of main” appears before its message.

question 11
The extension starts a counter and returns a `Job`. The `CoroutineScope` receiver makes the counter belong to the caller's scope.

question 12
The first helper returns immediately. The second helper waits for all greetings because it uses `coroutineScope`.

question 13
- launch: returns Job; does not block the thread.
- async: returns Deferred; does not block the thread.
- runBlocking: returns the block's result; blocks the calling thread.
- coroutineScope: returns the block's result; suspends the caller.
- withContext: returns the block's result; suspends the caller.

All wait for their own children to finish before completing.

question 14
`Job` represents work without a result. `Deferred` also provides a result through `await()`, which returns 42 here.

question 15
Y finishes first, then Z, then X. `coroutineScope` waits for all three, so “All done” is last.
```