plugins {
    kotlin("multiplatform") version "1.9.0"
    kotlin("plugin.serialization") version "1.9.0"
    id("org.jetbrains.compose") version "1.5.0"
    id("com.android.application")
}

kotlin {
    jvm()
    js(IR) {
        browser()
        binaries.executable()
    }
    android()
    ios()
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.ui)
            }
        }
        
        val jsMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.2.0-pre.625")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.2.0-pre.625")
            }
        }
        
        val androidMain by getting {
            dependencies {
                implementation("androidx.activity:activity-compose:1.7.2")
                implementation("androidx.compose.ui:ui-tooling:1.5.0")
            }
        }
        
        val iosMain by getting
    }
}