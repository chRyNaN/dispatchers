//[dispatchers](../../../index.md)/[com.chrynan.dispatchers](../index.md)/[AndroidCoroutineDispatchers](index.md)

# AndroidCoroutineDispatchers

[android]\
class [AndroidCoroutineDispatchers](index.md) : [CoroutineDispatchers](../../../../dispatchers/dispatchers/com.chrynan.dispatchers/-coroutine-dispatchers/index.md)

## Constructors

| | |
|---|---|
| [AndroidCoroutineDispatchers](-android-coroutine-dispatchers.md) | [android]<br>fun [AndroidCoroutineDispatchers](-android-coroutine-dispatchers.md)() |

## Properties

| Name | Summary |
|---|---|
| [default](default.md) | [android]<br>open override val [default](default.md): CoroutineDispatcher<br>The CoroutineDispatcher that is the default that is used by all standard builders like launch and async if no other CoroutineDispatcher is provided or in their context. Default implementations of this interface, refer to Dispatchers.Default for this value. |
| [io](io.md) | [android]<br>open override val [io](io.md): CoroutineDispatcher<br>The CoroutineDispatcher that is usually used for input/output, or intensive operations. Default implementations of this interface, refer to Dispatchers.IO for this value when it is available. |
| [main](main.md) | [android]<br>open override val [main](main.md): CoroutineDispatcher<br>The main CoroutineDispatcher that is usually used for UI work. Default implementations of this interface, refer to Dispatchers.Main for this value when it is available. |
| [unconfined](unconfined.md) | [android]<br>open override val [unconfined](unconfined.md): CoroutineDispatcher<br>The CoroutineDispatcher that is not confined to any specific thread. Default implementations of this interface refer to Dispatchers.Unconfined for this value. |
