package com.readapp.unittesting.Utils

import java.util.*
import java.util.regex.Pattern

class Helper {

    fun validatePhone(phone : String): Boolean{
        val contactRegex = "[0-1]{2}[^012]{1}[0-9]{8}"

       return Pattern.matches(contactRegex, phone)
    }

   companion object {
       fun validatePassword(password: String) : Boolean{

           if(password.isNotEmpty() && password.length in 6..15){
               return true
           }
           return false
       }

       fun stringReverse(input: String):Boolean{


           return false
       }


       fun badData(): MutableList<Array<Any>> {
           return Arrays.asList(
               arrayOf("123456", false),
               arrayOf("123456", false),
               arrayOf("123456", false),
           )
       }
   }
}