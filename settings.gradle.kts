pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
    }

    plugins {
        kotlin("multiplatform").version(extra["kotlin.version"] as String)
    }
}

rootProject.name = "repr_expect_actual_class_override"
