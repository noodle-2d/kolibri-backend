package com.ran.kolibri.idp.scheduler

import com.ran.kolibri.idp.core.IdpCoreClass

class IdpScheduler {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main() {
    println(IdpCoreClass().someLibraryMethod())
    println(IdpScheduler().greeting)
}
