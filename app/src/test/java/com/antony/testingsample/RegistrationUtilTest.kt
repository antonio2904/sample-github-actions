package com.antony.testingsample

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistration(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistration(
            "Antony",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `valid username and incorrectly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistration(
            "Antony",
            "123",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and empty passwords returns true`() {
        val result = RegistrationUtil.validateRegistration(
            "Antony",
            "",
            ""
        )
        assertThat(result).isFalse()
    }
}