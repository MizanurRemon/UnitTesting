package com.readapp.unittesting.Utils

import java.util.regex.Pattern

class Helper {

    fun validatePhone(phone : String): Boolean{
        val contactRegex = "[0-1]{2}[^012]{1}[0-9]{8}"

       return Pattern.matches(contactRegex, phone)
    }
}