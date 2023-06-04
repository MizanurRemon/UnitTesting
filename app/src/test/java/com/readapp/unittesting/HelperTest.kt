package com.readapp.unittesting

import java.util.*

class HelperTest {
    fun badData(): MutableList<Array<Any>> {
        return Arrays.asList(
            arrayOf("123456", false),
            arrayOf("123456", false),
            arrayOf("123456", false),
        )
    }

    //@ParameterizedTest
    //@MethodSource(value = )

}