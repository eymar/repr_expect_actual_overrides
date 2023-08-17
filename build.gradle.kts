plugins {
    kotlin("multiplatform")
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
    google()
}

kotlin {
    jvm()
    js(IR) {
        nodejs()
        binaries.executable()
    }
    linuxX64()
}