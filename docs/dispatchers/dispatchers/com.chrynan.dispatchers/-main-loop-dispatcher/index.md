//[dispatchers](../../../index.md)/[com.chrynan.dispatchers](../index.md)/[MainLoopDispatcher](index.md)

# MainLoopDispatcher

[ios]\
@ExperimentalCoroutinesApi

object [MainLoopDispatcher](index.md) : CoroutineDispatcher, Delay

## Functions

| Name | Summary |
|---|---|
| [delay](index.md#328100086%2FFunctions%2F1796620796) | [ios]<br>~~open~~ ~~suspend~~ ~~fun~~ [~~delay~~](index.md#328100086%2FFunctions%2F1796620796)~~(~~time: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)~~)~~ |
| [dispatch](dispatch.md) | [ios]<br>open override fun [dispatch](dispatch.md)(context: [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html), block: Runnable) |
| [dispatchYield](index.md#-1535615676%2FFunctions%2F1796620796) | [ios]<br>open fun [dispatchYield](index.md#-1535615676%2FFunctions%2F1796620796)(context: [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html), block: Runnable) |
| [interceptContinuation](index.md#-1798799910%2FFunctions%2F1796620796) | [ios]<br>fun &lt;[T](index.md#-1798799910%2FFunctions%2F1796620796)&gt; [interceptContinuation](index.md#-1798799910%2FFunctions%2F1796620796)(continuation: [Continuation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-continuation/index.html)&lt;[T](index.md#-1798799910%2FFunctions%2F1796620796)&gt;): [Continuation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-continuation/index.html)&lt;[T](index.md#-1798799910%2FFunctions%2F1796620796)&gt; |
| [invokeOnTimeout](invoke-on-timeout.md) | [ios]<br>open override fun [invokeOnTimeout](invoke-on-timeout.md)(timeMillis: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), block: Runnable, context: [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)): DisposableHandle |
| [isDispatchNeeded](index.md#-381715142%2FFunctions%2F1796620796) | [ios]<br>open fun [isDispatchNeeded](index.md#-381715142%2FFunctions%2F1796620796)(context: [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [limitedParallelism](index.md#311038380%2FFunctions%2F1796620796) | [ios]<br>open fun [limitedParallelism](index.md#311038380%2FFunctions%2F1796620796)(parallelism: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): CoroutineDispatcher |
| [plus](index.md#1709458771%2FFunctions%2F1796620796) | [ios]<br>~~operator~~ ~~fun~~ [~~plus~~](index.md#1709458771%2FFunctions%2F1796620796)~~(~~other: CoroutineDispatcher~~)~~~~:~~ CoroutineDispatcher |
| [releaseInterceptedContinuation](index.md#-1994945966%2FFunctions%2F1796620796) | [ios]<br>fun [releaseInterceptedContinuation](index.md#-1994945966%2FFunctions%2F1796620796)(continuation: [Continuation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-continuation/index.html)&lt;*&gt;) |
| [scheduleResumeAfterDelay](schedule-resume-after-delay.md) | [ios]<br>open override fun [scheduleResumeAfterDelay](schedule-resume-after-delay.md)(timeMillis: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), continuation: CancellableContinuation&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;) |
| [toString](index.md#883294532%2FFunctions%2F1796620796) | [ios]<br>open fun [toString](index.md#883294532%2FFunctions%2F1796620796)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
