@file:Suppress("unused")

package com.chrynan.dispatchers

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * Retrieves the default [CoroutineDispatchers.io] [CoroutineDispatcher] value. Each platform provides their own
 * instance of this [CoroutineDispatcher]. For Android, JVM, and Native platforms, there is an IO dispatcher that this
 * will return, for the JS platform, there is no specific IO dispatcher, so the default dispatcher is returned.
 */
@Suppress("UnusedReceiverParameter")
val Dispatchers.PlatformIO: CoroutineDispatcher
    get() = dispatchers.io
