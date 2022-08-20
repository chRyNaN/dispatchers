@file:Suppress("unused")

package com.chrynan.dispatchers

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * An interface that provides properties for accessing commonly used [CoroutineDispatcher]s. This differs from the
 * [Dispatchers] object in that it has consistent properties across all platforms and since [CoroutineDispatchers] is
 * an interface, it can easily be mocked and tested, and different implementations can easily be made to adapt to
 * different scenarios.
 *
 * Each supported platform contains an implementation of this [CoroutineDispatchers] interface and can be obtained via
 * the [dispatchers] top-level property.
 *
 * Note that not all platforms natively support all of the [CoroutineDispatcher] types (ex: only JVM supports
 * Dispatchers.IO), so fallbacks are provided when they aren't available for the default implementations.
 */
interface CoroutineDispatchers {

    /**
     * The companion object for the [CoroutineDispatchers] interface. This is provided so that it's possible to create
     * extension functions and properties on the companion object.
     */
    companion object

    /**
     * The main [CoroutineDispatcher] that is usually used for UI work. Default implementations of this interface,
     * refer to [Dispatchers.Main] for this value when it is available.
     *
     * Note that this isn't available on all platforms, so when one isn't present, this falls back to the [default]
     * [CoroutineDispatcher] in the default implementation.
     *
     * Default implementation [CoroutineDispatcher]:
     * Android - Main
     * JVM - JavaFx - Main (If there was an error obtaining the JavaFx Main [CoroutineDispatcher], then it falls back to
     * [default])
     * JVM - Swing - Main (If there was an error obtaining the Swing Main [CoroutineDispatcher], then it falls back to
     * [default])
     * JS - Default
     * iOS - Custom Main implementation or Default
     */
    val main: CoroutineDispatcher

    /**
     * The [CoroutineDispatcher] that is usually used for input/output, or intensive operations. Default
     * implementations of this interface, refer to Dispatchers.IO for this value when it is available.
     *
     * Note that this isn't available on all platforms, so when one isn't present, this falls back to the [default]
     * [CoroutineDispatcher] in the default implementation.
     *
     * Default implementation [CoroutineDispatcher]:
     * Android - IO
     * JVM - JavaFx - IO
     * JVM - Swing - IO
     * JS - Default
     * iOS - Default
     */
    val io: CoroutineDispatcher

    /**
     * The [CoroutineDispatcher] that is the default that is used by all standard builders like launch and async if no
     * other [CoroutineDispatcher] is provided or in their context. Default implementations of this interface, refer to
     * [Dispatchers.Default] for this value.
     *
     * Default implementation [CoroutineDispatcher]:
     * Android - Default
     * JVM - JavaFx - Default
     * JVM - Swing - Default
     * JS - Default
     * iOS - Default
     */
    val default: CoroutineDispatcher

    /**
     * The [CoroutineDispatcher] that is not confined to any specific thread. Default implementations of this
     * interface refer to [Dispatchers.Unconfined] for this value.
     *
     * Default implementation [CoroutineDispatcher]:
     * Android - Unconfined
     * JVM - JavaFx - Unconfined
     * JVM - Swing - Unconfined
     * JS - Unconfined
     * iOS - Unconfined
     */
    val unconfined: CoroutineDispatcher
}

/**
 * A convenience extension property delegating to the [CoroutineDispatchers.main] property.
 *
 * Typically, the [CoroutineDispatchers.main] [CoroutineDispatcher] is used for UI work, so it may be desirable to
 * refer to it as "ui".
 */
val CoroutineDispatchers.ui: CoroutineDispatcher
    get() = main

/**
 * Retrieves the default implementation of the [CoroutineDispatchers] interface for this target runtime.
 */
expect val dispatchers: CoroutineDispatchers

/**
 * The default [CoroutineDispatchers] instance. Each Kotlin target platform provides their own default implementation
 * of the [CoroutineDispatchers] interface and this returns the current platforms instance.
 */
val CoroutineDispatchers.Companion.default: CoroutineDispatchers
    get() = dispatchers
