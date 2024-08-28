package com.stevehechio.apps.hechiobdd

/**
// Created by Steve Hechio on 27/08/2024.
 */

const val LOGIN_SCREEN = "LoginScreenTag"
const val LOGIN_SCREEN_EMAIL = "LoginScreenEmailTag"
const val LOGIN_SCREEN_PASSWORD = "LoginScreenPasswordTag"
const val LOGIN_SCREEN_BUTTON = "LoginScreenButtonTag"
const val LOGIN_SCREEN_STATUS = "LoginScreenStatusTag"

fun isLoginSuccess(email: String, password: String): Boolean{
    return email == "stevehechio@gmail.com" && password == "sayNerd001"
}