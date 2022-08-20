//[dispatchers](../../../index.md)/[com.chrynan.dispatchers](../index.md)/[CoroutineDispatchers](index.md)

# CoroutineDispatchers

[common]\
interface [CoroutineDispatchers](index.md)

An interface that provides properties for accessing commonly used CoroutineDispatchers. This differs from the Dispatchers object in that it has consistent properties across all platforms and since [CoroutineDispatchers](index.md) is an interface, it can easily be mocked and tested, and different implementations can easily be made to adapt to different scenarios.

Each supported platform contains an implementation of this [CoroutineDispatchers](index.md) interface and can be obtained via the [dispatchers](../dispatchers.md) top-level property.

Note that not all platforms natively support all of the CoroutineDispatcher types (ex: only JVM supports Dispatchers.IO), so fallbacks are provided when they aren't available for the default implementations.

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md)<br>The companion object for the [CoroutineDispatchers](index.md) interface. This is provided so that it's possible to create extension functions and properties on the companion object. |

## Properties

| Name | Summary |
|---|---|
| [default](default.md) | [common]<br>abstract val [default](default.md): CoroutineDispatcher<br>The CoroutineDispatcher that is the default that is used by all standard builders like launch and async if no other CoroutineDispatcher is provided or in their context. Default implementations of this interface, refer to Dispatchers.Default for this value. |
| [io](io.md) | [common]<br>abstract val [io](io.md): CoroutineDispatcher<br>The CoroutineDispatcher that is usually used for input/output, or intensive operations. Default implementations of this interface, refer to Dispatchers.IO for this value when it is available. |
| [main](main.md) | [common]<br>abstract val [main](main.md): CoroutineDispatcher<br>The main CoroutineDispatcher that is usually used for UI work. Default implementations of this interface, refer to Dispatchers.Main for this value when it is available. |
| [unconfined](unconfined.md) | [common]<br>abstract val [unconfined](unconfined.md): CoroutineDispatcher<br>The CoroutineDispatcher that is not confined to any specific thread. Default implementations of this interface refer to Dispatchers.Unconfined for this value. |

## Inheritors

| Name |
|---|
| [AndroidCoroutineDispatchers](../-android-coroutine-dispatchers/index.md) |
| [IosCoroutineDispatchers](../-ios-coroutine-dispatchers/index.md) |
| [JsCoroutineDispatchers](../-js-coroutine-dispatchers/index.md) |
| [JvmCoroutineDispatchers](../-jvm-coroutine-dispatchers/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [ui](../ui.md) | [common]<br>val [CoroutineDispatchers](index.md).[ui](../ui.md): CoroutineDispatcher<br>A convenience extension property delegating to the [CoroutineDispatchers.main](main.md) property. |
