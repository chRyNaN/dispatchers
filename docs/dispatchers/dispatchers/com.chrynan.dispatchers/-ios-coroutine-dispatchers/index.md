//[dispatchers](../../../index.md)/[com.chrynan.dispatchers](../index.md)/[IosCoroutineDispatchers](index.md)

# IosCoroutineDispatchers

[ios]\
class [IosCoroutineDispatchers](index.md) : [CoroutineDispatchers](../../../../dispatchers/dispatchers/com.chrynan.dispatchers/-coroutine-dispatchers/index.md)

## Constructors

| | |
|---|---|
| [IosCoroutineDispatchers](-ios-coroutine-dispatchers.md) | [ios]<br>constructor() |

## Properties

| Name | Summary |
|---|---|
| [default](default.md) | [ios]<br>open override val [default](default.md): CoroutineDispatcher<br>The CoroutineDispatcher that is the default that is used by all standard builders like launch and async if no other CoroutineDispatcher is provided or in their context. Default implementations of this interface, refer to Dispatchers.Default for this value. |
| [io](io.md) | [ios]<br>open override val [io](io.md): CoroutineDispatcher<br>The CoroutineDispatcher that is usually used for input/output, or intensive operations. Default implementations of this interface, refer to Dispatchers.IO for this value when it is available. |
| [main](main.md) | [ios]<br>open override val [main](main.md): CoroutineDispatcher<br>The main CoroutineDispatcher that is usually used for UI work. Default implementations of this interface, refer to Dispatchers.Main for this value when it is available. |
| [ui](../ui.md) | [common]<br>val [CoroutineDispatchers](../-coroutine-dispatchers/index.md).[ui](../ui.md): CoroutineDispatcher<br>A convenience extension property delegating to the [CoroutineDispatchers.main](../-coroutine-dispatchers/main.md) property. |
| [unconfined](unconfined.md) | [ios]<br>open override val [unconfined](unconfined.md): CoroutineDispatcher<br>The CoroutineDispatcher that is not confined to any specific thread. Default implementations of this interface refer to Dispatchers.Unconfined for this value. |
