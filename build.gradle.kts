plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.41" apply false
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    if (name.endsWith("api") || name.endsWith("scheduler")) {
        apply(plugin = "application")
    } else {
        apply(plugin = "java-library")
    }

    repositories {
        jcenter()
    }

    version = "1.0"
}
