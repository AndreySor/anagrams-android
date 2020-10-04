package com.foxminded.anagram;

import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import static org.junit.Assert.*;

public class AnagramActivityTest {

    @Rule
    public ActivityTestRule<AnagramActivity> mActivityRule = new ActivityTestRule<>(AnagramActivity.class);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void onClick() throws Exception {
        onView(withId(R.id.enterSentence)).perform(typeText("ab3!c5d4()"));
        onView(withId(R.id.makeAnagram)).perform(click());
        onView(withId(R.id.anagramOutput)).check(matches(withText("dc3!b5a4()")));
    }
}
