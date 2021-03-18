# dispatchers

A simple Kotlin multi-platform wrapper around the Kotlin Coroutine Dispatchers object. Providing fall backs when a
CoroutineDispatcher isn't available for a target platform. <br/>
<img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/chrynan/dispatchers">

```kotlin
withContext(dispatchers.io) { ... }
```

## Building the library

The library is provided through [Repsy](https://repsy.io). Refer to
the [releases](https://github.com/chRyNaN/dispatchers/releases) for the latest version. <br/>
<img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/chrynan/dispatchers">

### Repository

```groovy
repositories {
    maven { url "https://repo.repsy.io/mvn/chrynan/public" }
}
```

### Dependencies

```groovy
implementation "com.chrynan.dispatchers:dispatchers:$VERSION"
```

### Additional Dependencies

Note that the targets **Android**, **JVM JavaFX**, and **JVM Swing** require additional dependencies from the Kotlin
Coroutines Library to properly resolve the `Dispatchers.Main` Coroutine Dispatcher. This is not a requirement solely of
this library, but of the Kotlin Coroutine Library as well. If the additional dependencies are not added,
the `Dispatchers.Default` will be used in its place when using the default `CoroutineDispatchers` implementations of
this library.

**Android:**

```groovy
implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:$COROUTINES_VERSION"
```

**JVM JavaFx:**

```groovy
implementation "org.jetbrains.kotlinx:kotlinx-coroutines-javafx:$COROUTINES_VERSION"
```

**JVM Swing:**

```groovy
implementation "org.jetbrains.kotlinx:kotlinx-coroutines-swing:$COROUTINES_VERSION"
```

## Using the library

Simply access the `dispatchers` top-level object to obtain an instance of the `CoroutineDispatchers` interface. Then use
the available dispatchers:

```kotlin
launch(dispatchers.main) {
    withContext(dispatchers.io) { ... }
    withContext(dispatchers.default) { ... }
    withContext(dispatchers.unconfined) { ... }
    withContext(dispatchers.ui) { ... }
}
```

## Documentation

Have a look at the [docs folder](docs) for documentation and more information about usage.

## License

```
Copyright 2021 chRyNaN

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
