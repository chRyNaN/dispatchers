//[dispatchers](../../../index.md)/[com.chrynan.dispatchers](../index.md)/[CoroutineDispatchers](index.md)



# CoroutineDispatchers  
 [common] interface [CoroutineDispatchers](index.md)

An interface that provides properties for accessing commonly used CoroutineDispatchers. This differs from the Dispatchers object in that it has consistent properties across all platforms and since [CoroutineDispatchers](index.md) is an interface, it can easily be mocked and tested, and different implementations can easily be made to adapt to different scenarios.



Each supported platform contains an implementation of this [CoroutineDispatchers](index.md) interface and can be obtained via the [dispatchers](../dispatchers.md) top-level property.



Note that not all platforms natively support all of the CoroutineDispatcher types (ex: only JVM supports Dispatchers.IO), so fallbacks are provided when they aren't available for the default implementations.

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.dispatchers/CoroutineDispatchers.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.dispatchers/CoroutineDispatchers.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br>More info  <br>The companion object for the [CoroutineDispatchers](index.md) interface.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.dispatchers/CoroutineDispatchers/default/#/PointingToDeclaration/"></a>[default](default.md)| <a name="com.chrynan.dispatchers/CoroutineDispatchers/default/#/PointingToDeclaration/"></a> [common] abstract val [default](default.md): CoroutineDispatcherThe CoroutineDispatcher that is the default that is used by all standard builders like launch and async if no other CoroutineDispatcher is provided or in their context.   <br>|
| <a name="com.chrynan.dispatchers/CoroutineDispatchers/io/#/PointingToDeclaration/"></a>[io](io.md)| <a name="com.chrynan.dispatchers/CoroutineDispatchers/io/#/PointingToDeclaration/"></a> [common] abstract val [io](io.md): CoroutineDispatcherThe CoroutineDispatcher that is usually used for input/output, or intensive operations.   <br>|
| <a name="com.chrynan.dispatchers/CoroutineDispatchers/main/#/PointingToDeclaration/"></a>[main](main.md)| <a name="com.chrynan.dispatchers/CoroutineDispatchers/main/#/PointingToDeclaration/"></a> [common] abstract val [main](main.md): CoroutineDispatcherThe main CoroutineDispatcher that is usually used for UI work.   <br>|
| <a name="com.chrynan.dispatchers/CoroutineDispatchers/unconfined/#/PointingToDeclaration/"></a>[unconfined](unconfined.md)| <a name="com.chrynan.dispatchers/CoroutineDispatchers/unconfined/#/PointingToDeclaration/"></a> [common] abstract val [unconfined](unconfined.md): CoroutineDispatcherThe CoroutineDispatcher that is not confined to any specific thread.   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.dispatchers/AndroidCoroutineDispatchers///PointingToDeclaration/"></a>[AndroidCoroutineDispatchers](../-android-coroutine-dispatchers/index.md)|
| <a name="com.chrynan.dispatchers/IosCoroutineDispatchers///PointingToDeclaration/"></a>[IosCoroutineDispatchers](../-ios-coroutine-dispatchers/index.md)|
| <a name="com.chrynan.dispatchers/JsCoroutineDispatchers///PointingToDeclaration/"></a>[JsCoroutineDispatchers](../-js-coroutine-dispatchers/index.md)|
| <a name="com.chrynan.dispatchers/JvmCoroutineDispatchers///PointingToDeclaration/"></a>[JvmCoroutineDispatchers](../-jvm-coroutine-dispatchers/index.md)|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.dispatchers//ui/com.chrynan.dispatchers.CoroutineDispatchers#/PointingToDeclaration/"></a>[ui](../ui.md)| <a name="com.chrynan.dispatchers//ui/com.chrynan.dispatchers.CoroutineDispatchers#/PointingToDeclaration/"></a>[common]  <br>Content  <br>val [CoroutineDispatchers](index.md).[ui](../ui.md): CoroutineDispatcher  <br>More info  <br>A convenience extension property delegating to the [CoroutineDispatchers.main](main.md) property.  <br><br><br>|

