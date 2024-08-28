package com.stevehechio.apps.hechiobdd

import androidx.compose.ui.test.assert
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.espresso.Espresso.closeSoftKeyboard
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import io.cucumber.junit.WithJunitRule
import org.junit.Rule

/**
// Created by Steve Hechio on 27/08/2024.
 */

@WithJunitRule
class LoginSteps {
    @get:Rule
    val composeTestRule = createComposeRule()


    @Given("^the login screen is displayed to the customer$")
    fun theLoginScreenIsDisplayedToTheCustomer() {
        composeTestRule.setContent {
           LoginScreen()
        }

        composeTestRule.onNodeWithTag(LOGIN_SCREEN).assertIsDisplayed()
        composeTestRule.onNodeWithTag(LOGIN_SCREEN_EMAIL).assertIsDisplayed()
        composeTestRule.onNodeWithTag(LOGIN_SCREEN_PASSWORD).assertIsDisplayed()
        composeTestRule.onNodeWithTag(LOGIN_SCREEN_BUTTON).assertIsDisplayed()
        composeTestRule.mainClock.advanceTimeBy(500)
    }

    @When("^the customer enters email \"([^\"]*)\"$")
    fun theCustomerEntersEmail(email: String) {
        composeTestRule.onNodeWithTag(LOGIN_SCREEN_EMAIL).performTextInput(email)
        composeTestRule.mainClock.advanceTimeBy(500)
        composeTestRule.onNodeWithTag(LOGIN_SCREEN_EMAIL).assertExists().assert(hasText(email))
    }

    @And("^the customer enters password \"([^\"]*)\"$")
    fun theCustomerEntersPassword(password: String) {
        composeTestRule.mainClock.advanceTimeBy(500)
        composeTestRule.onNodeWithTag(LOGIN_SCREEN_PASSWORD).performTextInput(password)

    }

    @And("^the customer requests to  login$")
    fun theCustomerRequestsToLogin() {
        composeTestRule.onNodeWithTag(LOGIN_SCREEN_BUTTON).performClick()
    }

    @Then("^the login status will be \"([^\"]*)\"$")
    fun theLoginStatusWillBe(status: String) {
        composeTestRule.waitUntil(timeoutMillis = 500) {
            closeSoftKeyboard()
            composeTestRule.onAllNodesWithText(status).fetchSemanticsNodes().isNotEmpty()
        }
        composeTestRule.onNodeWithTag(LOGIN_SCREEN_STATUS).assertExists().assert(hasText(status))
    }
}

//todo step 5 Create Espresso Test Class Now, let’s create the Espresso test class
//that will link our Gherkin scenarios to the application’s UI actions. Create a new Kotlin file named
//MainActivityTest.kt inside app/src/androidTest/java/com.examplebdd.test and add the following code:


//Install plugins
//
//Cucumber for Kotlin and Android
//FINANTEQ S.A. Plugin homepage a
//This plugin enables Cucumber support with step definitions written in Kotlin and allows running Cucumber scenarios as Android Instrumented tests directly from IDE.
//Main Features:
//• navigation between scenario and step implementation
//• creating step implementation in Kotlin
//• running scenario as Android Instrumented Test
//• running single example in Scenario Outline
//• creating Kotlin data class for given data table in scenario

//todo step 6: Edit Configurations- Add New configuration -Android Instrumented Tests- Select module — Apply/OK. Then Run this configuration.