package com.example.appgrapsupport

import android.content.Context

class MySharedPreferences {
    companion object {
        private val mMySharedPreferences = "com.example.appgrapsupport.MY_SHARED_PREFERENCES"
    }
    private lateinit var mcontext: Context
    constructor(mcontext:Context) {
        this.mcontext = mcontext
    }

    fun putBooleanValue(key: String, value: Boolean) {
        var sharedpreference = mcontext.getSharedPreferences(mMySharedPreferences, Context.MODE_PRIVATE)
        var editor = sharedpreference.edit()
        editor.putBoolean(key, value)
        editor.apply()
    }
    fun getBooleanValue(key: String): Boolean {
        var sharedpreference = mcontext.getSharedPreferences(mMySharedPreferences,Context.MODE_PRIVATE)
        return sharedpreference.getBoolean(key, false)
    }
}