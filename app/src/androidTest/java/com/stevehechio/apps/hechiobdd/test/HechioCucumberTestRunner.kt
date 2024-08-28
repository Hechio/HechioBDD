package com.stevehechio.apps.hechiobdd.test

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import org.junit.runner.RunWith

/**
// Created by Steve Hechio on 28/08/2024.
 */

@RunWith(Cucumber::class)
@CucumberOptions(
    features = ["src/androidTest/assets/features/login.feature"],
    glue = ["com.stevehechio.apps.hechiobdd.LoginSteps"],
    monochrome = true
)
class HechioCucumberTestRunner