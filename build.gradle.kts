buildscript {
    dependencies {
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.49")
    }
}

plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
            id ("com.android.library") version "7.4.0" apply false

}