package com.therealbluepandabear.pixapencil.canvasactivity

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.longClick
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.therealbluepandabear.pixapencil.R
import com.therealbluepandabear.pixapencil.activities.canvas.CanvasActivity
import com.therealbluepandabear.pixapencil.activities.canvas.colorPickerFragmentInstance
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class CanvasActivityColorPickerFragmentTests {
    @get:Rule
    val activityRule = ActivityScenarioRule(CanvasActivity::class.java)

    @Test
    fun checkColorPickerFragmentRootLayoutIsDisplayedWhenLongClickingOnPrimaryColor() {
        onView(withId(R.id.activityCanvas_colorPrimaryView)).perform(longClick())
        onView(withId(R.id.fragmentColorPicker_rootLayout)).check(matches(isDisplayed()))
    }

    @Test
    fun checkColorPickerFragmentIsDisplayedWhenLongClickingOnPrimaryColor() {
        onView(withId(R.id.activityCanvas_colorPrimaryView)).perform(longClick())
        onView(withId(colorPickerFragmentInstance.id)).check(matches(isDisplayed()))
    }
}
