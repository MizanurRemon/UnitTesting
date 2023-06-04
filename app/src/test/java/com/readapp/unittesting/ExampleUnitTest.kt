package com.readapp.unittesting

import com.readapp.unittesting.Utils.Helper
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Before
    fun setUp() {
        println("setUp fun")
    }

    @After
    fun tearDown() {
        println("tearDown fun")
    }

    @Test
    fun validatePhoneTest() {
        //assert
        val helper = Helper()
        //act
        val result = helper.validatePhone("01535166352")
        //

        assertEquals(true, result)
    }

    @Test
    fun validatePhoneTest_expecting_false() {
        //assert
        val helper = Helper()
        //act
        val result = helper.validatePhone("01135166352")
        //

        assertEquals(false, result)
    }

    @Test
    fun validatePasswordTest(){
        val result = Helper.validatePassword("12345")
        assertEquals(false, result)
    }
}