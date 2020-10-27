package com.example.unittestone


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{


    @Test
    fun `empty user name returns false`(){

        val result=RegistrationUtil.validateRegistration(
                "",
                "123",
                "123"
        )

         assertThat(result).isFalse()
        
    }


  @Test
    fun `valid user name and correctly repeated password returns true`(){

        val result=RegistrationUtil.validateRegistration(
                "Fidel",
                "123",
                "123"
        )

         assertThat(result).isTrue()

    }


  @Test
    fun `user name already exists returns false`(){

        val result=RegistrationUtil.validateRegistration(
                "Vero",
                "123",
                "123"
        )

         assertThat(result).isFalse()

    }


    @Test
    fun `empty password returns false`(){

        val result=RegistrationUtil.validateRegistration(
                "Mato",
                "",
                ""
        )

        assertThat(result).isFalse()

    }


    @Test
    fun `password repeated incorrectly returns false`(){

        val result=RegistrationUtil.validateRegistration(
                "Mato",
                "123",
                "111"
        )

        assertThat(result).isFalse()

    }


    @Test
    fun `password has less than 2 numbers returns false`(){

        val result=RegistrationUtil.validateRegistration(
                "Felix",
                "mato1",
                "mato1"
        )

        assertThat(result).isFalse()

    }





}