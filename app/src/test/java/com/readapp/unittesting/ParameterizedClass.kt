package com.readapp.unittesting

import com.readapp.unittesting.Utils.Helper
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters


@RunWith(value = Parameterized::class)
class ParameterizedClass(private val input: String, private val expectedOutput: Boolean) {

    @Test
    fun test() {
        val helper = Helper()
        val result = helper.validatePhone(input)

        assertEquals(expectedOutput, result)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "{index}: {0} is validate - {1}")
        fun data(): List<Array<Any>> {
            return listOf(
                arrayOf("01535166352", true),
                arrayOf("01135166352", false),
                arrayOf("01708014216", true),
                arrayOf("01986869906", true)
            )
        }
    }
}