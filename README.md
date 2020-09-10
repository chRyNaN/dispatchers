# dispatchers
A simple Kotlin multi-platform wrapper around the Kotlin Coroutine Dispatchers object. Providing fall backs when a CoroutineDispatcher isn't available for a target platform.

```kotlin
dispatchers.io
```

## Building the library
The library is provided through [Bintray](https://bintray.com/). Refer to the [releases](https://github.com/chRyNaN/dispatchers/releases) for the latest version.

### Repository
```groovy
repositories {
    maven {
        url = uri("https://dl.bintray.com/chrynan/chrynan")
    }
}
```

### Dependencies
**Common:**
```groovy
implementation "com.chrynan.dispatchers:dispatchers:$VERSION"
```

**JVM:**
```groovy
implementation "com.chrynan.dispatchers:dispatchers-jvm:$VERSION"
```

**JS:**
```groovy
implementation "com.chrynan.dispatchers:dispatchers-js:$VERSION"
```

**Ios Arm64:**
```groovy
implementation "com.chrynan.dispatchers:dispatchers-ios-arm64:$VERSION"
```

**Ios x64:**
```groovy
implementation "com.chrynan.dispatchers:dispatchers-ios-x64:$VERSION"
```

**Android:**
```groovy
implementation "com.chrynan.dispatchers:dispatchers-android:$VERSION"
```

### Additional Dependencies
Note that the targets Android, JVM JavaFX, and JVM Swing require additional dependencies from the Kotlin Coroutines Library to properly resolve the `Dispatchers.Main` Coroutine Dispatcher.
This is not a requirement solely of this library, but of the Kotlin Coroutine Library as well. 
If the additional dependencies are not added, the `Dispatchers.Default` will be used in its place when using the default `CoroutineDispatchers` implementations of this library.

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
Simply access the `dispatchers` top-level object to obtain an instance of the `CoroutineDispatchers` interface. Then use the available dispatchers:
```kotlin
launch(dispatchers.main) {
    withContext(dispatchers.io) { ... }
    withContext(dispatchers.default) { ... }
    withContext(dispatchers.unconfined) { ... }
    withContext(dispatchers.ui){ ... }
}
```

## License
```
Copyright 2020 chRyNaN

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
