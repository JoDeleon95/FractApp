package edu.cnm.deepdive.fractapp;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import edu.cnm.deepdive.fractapp.controller.MainActivity;
import org.junit.Before;
import org.junit.Rule;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

  @Rule
  public ActivityTestRule<MainActivity> activityActivityTestRule =
      new ActivityTestRule(MainActivity.class);

  @Before
  public void setUp() throws Exception {
  }
}