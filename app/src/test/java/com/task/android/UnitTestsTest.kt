package com.task.android

import com.google.common.truth.Truth.assertThat
import junit.framework.TestCase
import org.junit.Test

class UnitTestsTest : TestCase() {

    @Test
    fun `empty fields return false`() {
        assertThat(
            UnitTests.validateEntries(
                "",
                "abcde",
                "abcde"
            )
        ).isTrue()
    }
}
