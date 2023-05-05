//[dispatchers](../../../index.md)/[com.chrynan.dispatchers](../index.md)/[MainLoopDispatcher](index.md)

# MainLoopDispatcher

[ios]\
@ExperimentalCoroutinesApi

object [MainLoopDispatcher](index.md) : CoroutineDispatcher, Delay

## Functions

| Name | Summary |
|---|---|
| [delay](index.md#328100086%2FFunctions%2F1796620796) | [ios]<br>open suspend fun [~~delay~~](index.md#328100086%2FFunctions%2F1796620796)(time: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) |
| [dispatch](dispatch.md) | [ios]<br>open override fun [dispatch](dispatch.md)(context: [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html), block: Runnable) |
| [dispatchYield](index.md#-1535615676%2FFunctions%2F1796620796) | [ios]<br>open fun [dispatchYield](index.md#-1535615676%2FFunctions%2F1796620796)(context: [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html), block: Runnable) |
| [fold](index.md#466442070%2FFunctions%2F1796620796) | [ios]<br>open override fun &lt;[R](index.md#466442070%2FFunctions%2F1796620796)&gt; [fold](index.md#466442070%2FFunctions%2F1796620796)(initial: [R](index.md#466442070%2FFunctions%2F1796620796), operation: ([R](index.md#466442070%2FFunctions%2F1796620796), [CoroutineContext.Element](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/-element/index.html)) -&gt; [R](index.md#466442070%2FFunctions%2F1796620796)): [R](index.md#466442070%2FFunctions%2F1796620796) |
| [get](index.md#232613081%2FFunctions%2F1796620796) | [ios]<br>open operator override fun &lt;[E](index.md#232613081%2FFunctions%2F1796620796) : [CoroutineContext.Element](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/-element/index.html)&gt; [get](index.md#232613081%2FFunctions%2F1796620796)(key: [CoroutineContext.Key](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/-key/index.html)&lt;[E](index.md#232613081%2FFunctions%2F1796620796)&gt;): [E](index.md#232613081%2FFunctions%2F1796620796)? |
| [interceptContinuation](index.md#-1798799910%2FFunctions%2F1796620796) | [ios]<br>override fun &lt;[T](index.md#-1798799910%2FFunctions%2F1796620796)&gt; [interceptContinuation](index.md#-1798799910%2FFunctions%2F1796620796)(continuation: [Continuation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-continuation/index.html)&lt;[T](index.md#-1798799910%2FFunctions%2F1796620796)&gt;): [Continuation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-continuation/index.html)&lt;[T](index.md#-1798799910%2FFunctions%2F1796620796)&gt; |
| [invokeOnTimeout](invoke-on-timeout.md) | [ios]<br>open override fun [invokeOnTimeout](invoke-on-timeout.md)(timeMillis: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), block: Runnable, context: [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)): DisposableHandle |
| [isDispatchNeeded](index.md#-381715142%2FFunctions%2F1796620796) | [ios]<br>open fun [isDispatchNeeded](index.md#-381715142%2FFunctions%2F1796620796)(context: [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [limitedParallelism](index.md#311038380%2FFunctions%2F1796620796) | [ios]<br>open fun [limitedParallelism](index.md#311038380%2FFunctions%2F1796620796)(parallelism: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): CoroutineDispatcher |
| [minusKey](index.md#-1830620809%2FFunctions%2F1796620796) | [ios]<br>open override fun [minusKey](index.md#-1830620809%2FFunctions%2F1796620796)(key: [CoroutineContext.Key](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/-key/index.html)&lt;*&gt;): [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html) |
| [plus](index.md#1141296693%2FFunctions%2F1796620796) | [ios]<br>open operator fun [plus](index.md#1141296693%2FFunctions%2F1796620796)(context: [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)): [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)<br>operator fun [~~plus~~](index.md#1709458771%2FFunctions%2F1796620796)(other: CoroutineDispatcher): CoroutineDispatcher |
| [releaseInterceptedContinuation](index.md#-1994945966%2FFunctions%2F1796620796) | [ios]<br>override fun [releaseInterceptedContinuation](index.md#-1994945966%2FFunctions%2F1796620796)(continuation: [Continuation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-continuation/index.html)&lt;*&gt;) |
| [scheduleResumeAfterDelay](schedule-resume-after-delay.md) | [ios]<br>open override fun [scheduleResumeAfterDelay](schedule-resume-after-delay.md)(timeMillis: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), continuation: CancellableContinuation&lt;[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)&gt;) |
| [toString](index.md#883294532%2FFunctions%2F1796620796) | [ios]<br>open override fun [toString](index.md#883294532%2FFunctions%2F1796620796)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Properties

| Name | Summary |
|---|---|
| [key](index.md#-1762250447%2FProperties%2F1796620796) | [ios]<br>open override val [key](index.md#-1762250447%2FProperties%2F1796620796): [CoroutineContext.Key](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/-key/index.html)&lt;*&gt; |
