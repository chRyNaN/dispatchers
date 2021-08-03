package com.chrynan.dispatchers

import kotlinx.coroutines.*

class IosCoroutineDispatchers : CoroutineDispatchers {

    @ExperimentalCoroutinesApi
    @InternalCoroutinesApi
    override val main: CoroutineDispatcher = try {
        Dispatchers.Main
    } catch (exception: IllegalStateException) {
        Dispatchers.Default
    }

    override val default: CoroutineDispatcher = Dispatchers.Default

    override val io: CoroutineDispatcher = Dispatchers.Default

    override val unconfined: CoroutineDispatcher = Dispatchers.Unconfined
}

actual val dispatchers: CoroutineDispatchers = IosCoroutineDispatchers()
