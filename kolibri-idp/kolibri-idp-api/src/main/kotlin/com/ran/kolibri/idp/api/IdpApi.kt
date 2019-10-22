package com.ran.kolibri.idp.api

import com.ran.kolibri.idp.core.IdpCoreClass

class IdpApi {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main() {
    println(IdpCoreClass().someLibraryMethod())
    println(IdpApi().greeting)
}
