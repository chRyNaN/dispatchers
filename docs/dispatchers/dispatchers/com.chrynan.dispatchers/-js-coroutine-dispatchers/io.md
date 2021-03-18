//[dispatchers](../../../index.md)/[com.chrynan.dispatchers](../index.md)/[JsCoroutineDispatchers](index.md)/[io](io.md)



# io  
[js]  
Content  
open override val [io](io.md): CoroutineDispatcher  
More info  


The CoroutineDispatcher that is usually used for input/output, or intensive operations. Default implementations of this interface, refer to Dispatchers.IO for this value when it is available.



Note that this isn't available on all platforms, so when one isn't present, this falls back to the default in the default implementation.



Default implementation CoroutineDispatcher: Android - IO JVM - JavaFx - IO JVM - Swing - IO JS - Default iOS - Default

  



