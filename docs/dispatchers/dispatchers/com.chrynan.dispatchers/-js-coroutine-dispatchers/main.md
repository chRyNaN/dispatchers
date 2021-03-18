//[dispatchers](../../../index.md)/[com.chrynan.dispatchers](../index.md)/[JsCoroutineDispatchers](index.md)/[main](main.md)



# main  
[js]  
Content  
open override val [main](main.md): CoroutineDispatcher  
More info  


The main CoroutineDispatcher that is usually used for UI work. Default implementations of this interface, refer to Dispatchers.Main for this value when it is available.



Note that this isn't available on all platforms, so when one isn't present, this falls back to the default in the default implementation.



Default implementation CoroutineDispatcher: Android - Main JVM - JavaFx - Main (If there was an error obtaining the JavaFx Main CoroutineDispatcher, then it falls back to [default](default.md)) JVM - Swing - Main (If there was an error obtaining the Swing Main CoroutineDispatcher, then it falls back to [default](default.md)) JS - Default iOS - Default

  



