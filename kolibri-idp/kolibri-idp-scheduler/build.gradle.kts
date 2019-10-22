plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.41"
    application
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation(project(":kolibri-idp:kolibri-idp-core"))

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClassName = "com.ran.kolibri.idp.scheduler.IdpSchedulerKt"
}
