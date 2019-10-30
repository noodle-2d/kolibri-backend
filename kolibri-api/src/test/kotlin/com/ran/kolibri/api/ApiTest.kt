package com.ran.kolibri.api

import kotlin.test.Test
import kotlin.test.assertNotNull

class ApiTest {
    @Test fun testAppHasAGreeting() {
        val classUnderTest = Api()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}
