//[dispatchers](../../../index.md)/[com.chrynan.dispatchers](../index.md)/[MainLoopDispatcher](index.md)



# MainLoopDispatcher  
 [ios] @ExperimentalCoroutinesApi()  
  
object [MainLoopDispatcher](index.md) : CoroutineDispatcher, Delay   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="kotlinx.coroutines/Delay/delay/#kotlin.Long/PointingToDeclaration/"></a>[delay](index.md#%5Bkotlinx.coroutines%2FDelay%2Fdelay%2F%23kotlin.Long%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)| <a name="kotlinx.coroutines/Delay/delay/#kotlin.Long/PointingToDeclaration/"></a>[ios]  <br>Content  <br>open suspend fun [delay](index.md#%5Bkotlinx.coroutines%2FDelay%2Fdelay%2F%23kotlin.Long%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)(time: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))  <br><br><br>|
| <a name="com.chrynan.dispatchers/MainLoopDispatcher/dispatch/#CoroutineContext#kotlinx.coroutines.Runnable/PointingToDeclaration/"></a>[dispatch](dispatch.md)| <a name="com.chrynan.dispatchers/MainLoopDispatcher/dispatch/#CoroutineContext#kotlinx.coroutines.Runnable/PointingToDeclaration/"></a>[ios]  <br>Content  <br>open override fun [dispatch](dispatch.md)(context: <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<ERROR CLASS>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} ---><ERROR CLASS><!--- --->, block: Runnable)  <br><br><br>|
| <a name="kotlinx.coroutines/CoroutineDispatcher/dispatchYield/#kotlin.coroutines.CoroutineContext#kotlinx.coroutines.Runnable/PointingToDeclaration/"></a>[dispatchYield](index.md#%5Bkotlinx.coroutines%2FCoroutineDispatcher%2FdispatchYield%2F%23kotlin.coroutines.CoroutineContext%23kotlinx.coroutines.Runnable%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)| <a name="kotlinx.coroutines/CoroutineDispatcher/dispatchYield/#kotlin.coroutines.CoroutineContext#kotlinx.coroutines.Runnable/PointingToDeclaration/"></a>[ios]  <br>Content  <br>open fun [dispatchYield](index.md#%5Bkotlinx.coroutines%2FCoroutineDispatcher%2FdispatchYield%2F%23kotlin.coroutines.CoroutineContext%23kotlinx.coroutines.Runnable%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)(context: [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html), block: Runnable)  <br><br><br>|
| <a name="kotlinx.coroutines/CoroutineDispatcher/interceptContinuation/#kotlin.coroutines.Continuation[TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[interceptContinuation](index.md#%5Bkotlinx.coroutines%2FCoroutineDispatcher%2FinterceptContinuation%2F%23kotlin.coroutines.Continuation%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)| <a name="kotlinx.coroutines/CoroutineDispatcher/interceptContinuation/#kotlin.coroutines.Continuation[TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[ios]  <br>Content  <br>fun <[T](index.md#%5Bkotlinx.coroutines%2FCoroutineDispatcher%2FinterceptContinuation%2F%23kotlin.coroutines.Continuation%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)> [interceptContinuation](index.md#%5Bkotlinx.coroutines%2FCoroutineDispatcher%2FinterceptContinuation%2F%23kotlin.coroutines.Continuation%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)(continuation: [Continuation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-continuation/index.html)<[T](index.md#%5Bkotlinx.coroutines%2FCoroutineDispatcher%2FinterceptContinuation%2F%23kotlin.coroutines.Continuation%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)>): [Continuation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-continuation/index.html)<[T](index.md#%5Bkotlinx.coroutines%2FCoroutineDispatcher%2FinterceptContinuation%2F%23kotlin.coroutines.Continuation%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)>  <br><br><br>|
| <a name="com.chrynan.dispatchers/MainLoopDispatcher/invokeOnTimeout/#kotlin.Long#kotlinx.coroutines.Runnable#CoroutineContext/PointingToDeclaration/"></a>[invokeOnTimeout](invoke-on-timeout.md)| <a name="com.chrynan.dispatchers/MainLoopDispatcher/invokeOnTimeout/#kotlin.Long#kotlinx.coroutines.Runnable#CoroutineContext/PointingToDeclaration/"></a>[ios]  <br>Content  <br>open override fun [invokeOnTimeout](invoke-on-timeout.md)(timeMillis: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), block: Runnable, context: <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<ERROR CLASS>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} ---><ERROR CLASS><!--- --->): DisposableHandle  <br><br><br>|
| <a name="kotlinx.coroutines/CoroutineDispatcher/isDispatchNeeded/#kotlin.coroutines.CoroutineContext/PointingToDeclaration/"></a>[isDispatchNeeded](index.md#%5Bkotlinx.coroutines%2FCoroutineDispatcher%2FisDispatchNeeded%2F%23kotlin.coroutines.CoroutineContext%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)| <a name="kotlinx.coroutines/CoroutineDispatcher/isDispatchNeeded/#kotlin.coroutines.CoroutineContext/PointingToDeclaration/"></a>[ios]  <br>Content  <br>open fun [isDispatchNeeded](index.md#%5Bkotlinx.coroutines%2FCoroutineDispatcher%2FisDispatchNeeded%2F%23kotlin.coroutines.CoroutineContext%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)(context: [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>|
| <a name="kotlinx.coroutines/CoroutineDispatcher/plus/#kotlinx.coroutines.CoroutineDispatcher/PointingToDeclaration/"></a>[plus](index.md#%5Bkotlinx.coroutines%2FCoroutineDispatcher%2Fplus%2F%23kotlinx.coroutines.CoroutineDispatcher%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)| <a name="kotlinx.coroutines/CoroutineDispatcher/plus/#kotlinx.coroutines.CoroutineDispatcher/PointingToDeclaration/"></a>[ios]  <br>Content  <br>~~operator~~ ~~fun~~ [~~plus~~](index.md#%5Bkotlinx.coroutines%2FCoroutineDispatcher%2Fplus%2F%23kotlinx.coroutines.CoroutineDispatcher%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)~~(~~~~other~~~~:~~ CoroutineDispatcher~~)~~~~:~~ CoroutineDispatcher  <br><br><br>|
| <a name="kotlinx.coroutines/CoroutineDispatcher/releaseInterceptedContinuation/#kotlin.coroutines.Continuation[*]/PointingToDeclaration/"></a>[releaseInterceptedContinuation](index.md#%5Bkotlinx.coroutines%2FCoroutineDispatcher%2FreleaseInterceptedContinuation%2F%23kotlin.coroutines.Continuation%5B*%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)| <a name="kotlinx.coroutines/CoroutineDispatcher/releaseInterceptedContinuation/#kotlin.coroutines.Continuation[*]/PointingToDeclaration/"></a>[ios]  <br>Content  <br>open fun [releaseInterceptedContinuation](index.md#%5Bkotlinx.coroutines%2FCoroutineDispatcher%2FreleaseInterceptedContinuation%2F%23kotlin.coroutines.Continuation%5B*%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)(continuation: [Continuation](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-continuation/index.html)<*>)  <br><br><br>|
| <a name="com.chrynan.dispatchers/MainLoopDispatcher/scheduleResumeAfterDelay/#kotlin.Long#kotlinx.coroutines.CancellableContinuation[kotlin.Unit]/PointingToDeclaration/"></a>[scheduleResumeAfterDelay](schedule-resume-after-delay.md)| <a name="com.chrynan.dispatchers/MainLoopDispatcher/scheduleResumeAfterDelay/#kotlin.Long#kotlinx.coroutines.CancellableContinuation[kotlin.Unit]/PointingToDeclaration/"></a>[ios]  <br>Content  <br>open override fun [scheduleResumeAfterDelay](schedule-resume-after-delay.md)(timeMillis: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), continuation: CancellableContinuation<[Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)>)  <br><br><br>|
| <a name="kotlinx.coroutines/CoroutineDispatcher/toString/#/PointingToDeclaration/"></a>[toString](index.md#%5Bkotlinx.coroutines%2FCoroutineDispatcher%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)| <a name="kotlinx.coroutines/CoroutineDispatcher/toString/#/PointingToDeclaration/"></a>[ios]  <br>Content  <br>open fun [toString](index.md#%5Bkotlinx.coroutines%2FCoroutineDispatcher%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-2048934116)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>|
