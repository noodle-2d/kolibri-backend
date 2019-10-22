package com.ran.kolibri.idp.scheduler

import kotlin.test.Test
import kotlin.test.assertNotNull

class IdpSchedulerTest {
    @Test fun testAppHasAGreeting() {
        val classUnderTest = IdpScheduler()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}
