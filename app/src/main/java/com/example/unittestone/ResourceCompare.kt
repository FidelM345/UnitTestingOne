package com.example.unittestone

import android.content.Context

class ResourceCompare {


    fun compareMe(context: Context, resId:Int, string:String): Boolean{

        return context.getString(resId) == string
    }

}