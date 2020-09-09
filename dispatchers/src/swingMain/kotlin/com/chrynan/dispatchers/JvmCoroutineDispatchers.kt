package com.chrynan.dispatchers

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class JvmCoroutineDispatchers : CoroutineDispatchers {

    override val main: CoroutineDispatcher = try {
        Dispatchers.Main
    } catch (exception: IllegalStateException) {
        Dispatchers.Default
    }

    override val default: CoroutineDispatcher = Dispatchers.Default

    override val io: CoroutineDispatcher = Dispatchers.IO

    override val unconfined: CoroutineDispatcher = Dispatchers.Unconfined
}

actual val dispatchers: CoroutineDispatchers = JvmCoroutineDispatchers()
