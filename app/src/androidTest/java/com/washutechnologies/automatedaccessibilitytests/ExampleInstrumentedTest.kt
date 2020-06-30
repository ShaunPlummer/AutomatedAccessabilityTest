package com.washutechnologies.automatedaccessibilitytests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

/**
 * A simple Instrumented test, which will execute on an Android device, checking that the user
 * is able to click an on screen button. No accessibility checks are performed.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 *
 * * Note test classes must be run individually.
 */
class ExampleInstrumentedTest {

    @get:Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun buttonWithIdCanBeClicked() {
        onView(withId(R.id.cardEndIcon)).perform(ViewActions.click())
    }
}
