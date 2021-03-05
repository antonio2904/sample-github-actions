package com.antony.testingsample

object RegistrationUtil {

    ///////////////////////////////////////////////////////////////////////////
    // the input is not valid if...
    // ...the username/password is empty
    // ...the username is already taken
    // ...the confirmed password is not same as real password
    // ...the password contains less than 2 characters
    ///////////////////////////////////////////////////////////////////////////

    fun validateRegistration(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        return if (username.isBlank() || password.isBlank()) {
            false
        } else if (password != confirmPassword) {
            false
        } else password.length >= 2
    }
}