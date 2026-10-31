plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.levelup.routinetracker"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.levelup.routinetracker"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
