package com.example.unittestone

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test


class ResourceCompareTest{

    //val resourceComparer=ResourceCompare()/bad practise

    private  lateinit var resourceComparer:ResourceCompare



    @Before
    fun setup(){
        //the method is run before any testcase is executed
        resourceComparer= ResourceCompare() //
    }

    @After
    fun  teardown(){
        //the method is called after every testcase. Can be used for closing the room database
    }



    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){

        //resourceComparer= ResourceCompare() good practise but a lot of boiler plate code

        val  context= ApplicationProvider.getApplicationContext<Context>()

        val result=resourceComparer.compareMe(context,R.string.app_name,"UnitTestOne")

        assertThat(result).isTrue()

    }



    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse(){

       // resourceComparer=ResourceCompare()

        val  context= ApplicationProvider.getApplicationContext<Context>()

        val result=resourceComparer.compareMe(context,R.string.app_name,"Baby")

        assertThat(result).isFalse()

    }
}