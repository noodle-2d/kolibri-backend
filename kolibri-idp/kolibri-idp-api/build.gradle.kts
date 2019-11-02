dependencies {
    implementation(project(":kolibri-model"))
    implementation(project(":kolibri-core"))
    implementation(project(":kolibri-idp:kolibri-idp-core"))
}

application {
    mainClassName = "com.ran.kolibri.idp.api.MainKt"
}
