package com.task.android

object UnitTests {
    private val employeesList = listOf("ABC", "DEF", "GHI")

    fun validateEntries(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {

        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            return false
        }

        if (username in employeesList) {
            return false
        }

        if (password != confirmPassword) {
            return false
        }

        return true
    }
}