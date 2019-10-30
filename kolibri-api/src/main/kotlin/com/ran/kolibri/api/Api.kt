package com.ran.kolibri.api

import com.ran.kolibri.core.CoreClass

class Api {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main() {
    println(CoreClass().someLibraryMethod())
    println(Api().greeting)
}
