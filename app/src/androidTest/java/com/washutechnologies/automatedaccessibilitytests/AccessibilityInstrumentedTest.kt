package com.washutechnologies.automatedaccessibilitytests

import androidx.test.espresso.Espresso
import androidx.test.espresso.accessibility.AccessibilityChecks
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.rule.ActivityTestRule
import org.junit.BeforeClass
import org.junit.Rule
import org.junit.Test

/**
 * A simple Instrumented test, checking that the user is able to click an on screen button. Which
 * automatically performs accessibility when the test steps interact with the view element.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 *
 * * Note test classes must be run individually.
 */
class AccessibilityInstrumentedTest {
    companion object {
        @BeforeClass
        @JvmStatic
        fun enableAccessibilityChecks() {
            AccessibilityChecks.enable()
        }
    }

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    /**
     * This test will fail with two accessibility errors
     *
     * View is missing speakable text needed for a screen reader,
     * View falls below the minimum recommended size for touch targets. Minimum touch target size is 48x48dp. Actual size is 24.0x24.0dp (screen density is 2.0)
     */
    @Test
    fun buttonWithIdCanBeClicked() {
        Espresso.onView(ViewMatchers.withId(R.id.cardEndIcon)).perform(ViewActions.click())
    }
}
