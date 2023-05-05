//[dispatchers](../../index.md)/[com.chrynan.dispatchers](index.md)/[PlatformIO](-platform-i-o.md)

# PlatformIO

[common]\
val Dispatchers.[PlatformIO](-platform-i-o.md): CoroutineDispatcher

Retrieves the default CoroutineDispatchers.io value. Each platform provides their own instance of this CoroutineDispatcher. For Android, JVM, and Native platforms, there is an IO dispatcher that this will return, for the JS platform, there is no specific IO dispatcher, so the default dispatcher is returned.
