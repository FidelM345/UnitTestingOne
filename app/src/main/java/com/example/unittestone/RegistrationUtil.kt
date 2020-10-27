package com.example.unittestone

object RegistrationUtil {

    val existingUsers= listOf<String>("Vero","Morris")

    fun validateRegistration(userName: String, password:String, confirmPass: String): Boolean{

        if (userName.isEmpty()||password.isEmpty()){
            return false
        }

        if (userName in existingUsers){
            return false
        }


        if (password !=confirmPass){
            return false
        }


        //checks whether the digits or numbers are less than 2
        if (password.count { it.isDigit() } <2){
            return false
        }

        return true
    }


}