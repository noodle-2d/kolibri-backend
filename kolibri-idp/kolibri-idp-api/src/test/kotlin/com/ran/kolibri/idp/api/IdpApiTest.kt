package com.ran.kolibri.idp.api

import kotlin.test.Test
import kotlin.test.assertNotNull

class IdpApiTest {
    @Test fun testAppHasAGreeting() {
        val classUnderTest = IdpApi()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}
