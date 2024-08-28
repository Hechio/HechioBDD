package com.stevehechio.apps.hechiobdd;

import android.os.Bundle;

import io.cucumber.android.runner.CucumberAndroidJUnitRunner;

/**
 * // Created by Steve Hechio on 28/08/2024.
 */
@SuppressWarnings("unused")
public class CucumberTestInstrumentation extends CucumberAndroidJUnitRunner {

    private static final String CUCUMBER_TAGS_KEY = "tags";
    private static final String CUCUMBER_SCENARIO_KEY = "name";

    @Override
    public void onCreate(final Bundle bundle) {
        String tags = BuildConfig.TEST_TAGS;
        String scenario = BuildConfig.TEST_SCENARIO;
        super.onCreate(bundle);
    }
}
