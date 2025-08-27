package com.example.your_app; // Replace with your package

import androidx.test.rule.ActivityTestRule;
import dev.flutter.plugins.integration_test.FlutterTestRunner;
import org.junit.Rule;
import org.junit.runner.RunWith;
import io.flutter.embedding.android.FlutterActivity;

@RunWith(FlutterTestRunner.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<FlutterActivity> rule = new ActivityTestRule<>(FlutterActivity.class, true, false);
}