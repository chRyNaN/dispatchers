//[dispatchers](../../index.md)/[com.chrynan.dispatchers](index.md)

# Package com.chrynan.dispatchers

## Types

| Name | Summary |
|---|---|
| [AndroidCoroutineDispatchers](-android-coroutine-dispatchers/index.md) | [android]<br>class [AndroidCoroutineDispatchers](-android-coroutine-dispatchers/index.md) : [CoroutineDispatchers](../../../dispatchers/dispatchers/com.chrynan.dispatchers/-coroutine-dispatchers/index.md) |
| [CoroutineDispatchers](-coroutine-dispatchers/index.md) | [common]<br>interface [CoroutineDispatchers](-coroutine-dispatchers/index.md)<br>An interface that provides properties for accessing commonly used CoroutineDispatchers. This differs from the Dispatchers object in that it has consistent properties across all platforms and since [CoroutineDispatchers](-coroutine-dispatchers/index.md) is an interface, it can easily be mocked and tested, and different implementations can easily be made to adapt to different scenarios. |
| [IosCoroutineDispatchers](-ios-coroutine-dispatchers/index.md) | [ios]<br>class [IosCoroutineDispatchers](-ios-coroutine-dispatchers/index.md) : [CoroutineDispatchers](../../../dispatchers/dispatchers/com.chrynan.dispatchers/-coroutine-dispatchers/index.md) |
| [JsCoroutineDispatchers](-js-coroutine-dispatchers/index.md) | [js]<br>class [JsCoroutineDispatchers](-js-coroutine-dispatchers/index.md) : [CoroutineDispatchers](../../../dispatchers/dispatchers/com.chrynan.dispatchers/-coroutine-dispatchers/index.md) |
| [JvmCoroutineDispatchers](-jvm-coroutine-dispatchers/index.md) | [jvm]<br>class [JvmCoroutineDispatchers](-jvm-coroutine-dispatchers/index.md) : [CoroutineDispatchers](../../../dispatchers/dispatchers/com.chrynan.dispatchers/-coroutine-dispatchers/index.md) |
| [MainLoopDispatcher](-main-loop-dispatcher/index.md) | [ios]<br>@ExperimentalCoroutinesApi<br>object [MainLoopDispatcher](-main-loop-dispatcher/index.md) : CoroutineDispatcher, Delay |

## Properties

| Name | Summary |
|---|---|
| [default](default.md) | [common]<br>val [CoroutineDispatchers.Companion](-coroutine-dispatchers/-companion/index.md).[default](default.md): [CoroutineDispatchers](-coroutine-dispatchers/index.md)<br>The default [CoroutineDispatchers](-coroutine-dispatchers/index.md) instance. Each Kotlin target platform provides their own default implementation of the [CoroutineDispatchers](-coroutine-dispatchers/index.md) interface and this returns the current platforms instance. |
| [dispatchers](dispatchers.md) | [common]<br>expect val [dispatchers](dispatchers.md): [CoroutineDispatchers](-coroutine-dispatchers/index.md)<br>Retrieves the default implementation of the [CoroutineDispatchers](-coroutine-dispatchers/index.md) interface for this target runtime.<br>[android, ios, js, jvm]<br>actual val [dispatchers](dispatchers.md): [CoroutineDispatchers](../../../dispatchers/dispatchers/com.chrynan.dispatchers/-coroutine-dispatchers/index.md) |
| [ui](ui.md) | [common]<br>val [CoroutineDispatchers](-coroutine-dispatchers/index.md).[ui](ui.md): CoroutineDispatcher<br>A convenience extension property delegating to the [CoroutineDispatchers.main](-coroutine-dispatchers/main.md) property. |
