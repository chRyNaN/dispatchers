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

**JVM JavaFx:**
```groovy
implementation "com.chrynan.dispatchers:dispatchers-jvm-javafx:$VERSION"
```

**JVM Swing:**
```groovy
implementation "com.chrynan.dispatchers:dispatchers-jvm-swing:$VERSION"
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
