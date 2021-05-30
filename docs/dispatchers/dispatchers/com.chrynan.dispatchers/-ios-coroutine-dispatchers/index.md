//[dispatchers](../../../index.md)/[com.chrynan.dispatchers](../index.md)/[IosCoroutineDispatchers](index.md)



# IosCoroutineDispatchers  
 [ios] class [IosCoroutineDispatchers](index.md) : [CoroutineDispatchers](../-coroutine-dispatchers/index.md)   


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.dispatchers/IosCoroutineDispatchers/default/#/PointingToDeclaration/"></a>[default](default.md)| <a name="com.chrynan.dispatchers/IosCoroutineDispatchers/default/#/PointingToDeclaration/"></a> [ios] open override val [default](default.md): CoroutineDispatcherThe CoroutineDispatcher that is the default that is used by all standard builders like launch and async if no other CoroutineDispatcher is provided or in their context.   <br>|
| <a name="com.chrynan.dispatchers/IosCoroutineDispatchers/io/#/PointingToDeclaration/"></a>[io](io.md)| <a name="com.chrynan.dispatchers/IosCoroutineDispatchers/io/#/PointingToDeclaration/"></a> [ios] open override val [io](io.md): CoroutineDispatcherThe CoroutineDispatcher that is usually used for input/output, or intensive operations.   <br>|
| <a name="com.chrynan.dispatchers/IosCoroutineDispatchers/main/#/PointingToDeclaration/"></a>[main](main.md)| <a name="com.chrynan.dispatchers/IosCoroutineDispatchers/main/#/PointingToDeclaration/"></a> [ios] @ExperimentalCoroutinesApi()  <br>  <br>open override val [main](main.md): CoroutineDispatcherThe main CoroutineDispatcher that is usually used for UI work.   <br>|
| <a name="com.chrynan.dispatchers/IosCoroutineDispatchers/unconfined/#/PointingToDeclaration/"></a>[unconfined](unconfined.md)| <a name="com.chrynan.dispatchers/IosCoroutineDispatchers/unconfined/#/PointingToDeclaration/"></a> [ios] open override val [unconfined](unconfined.md): CoroutineDispatcherThe CoroutineDispatcher that is not confined to any specific thread.   <br>|

