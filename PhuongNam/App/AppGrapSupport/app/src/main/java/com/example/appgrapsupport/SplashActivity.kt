package com.example.appgrapsupport

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    companion object {
        val mkeyFirstInstall = "com.example.appgrapsupport.KEY_FIRST_INSTALL"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        moveScreen()
    }
    //moveScreen
    private fun moveScreen() {
        var mysharedpreferences = MySharedPreferences(this)
        Handler().postDelayed({
            if (mysharedpreferences.getBooleanValue(mkeyFirstInstall)) {
                var intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            } else {
                var intent = Intent(this, IntroductionActivity::class.java)
                startActivity(intent)
                finish()
                mysharedpreferences.putBooleanValue(mkeyFirstInstall, true)
            }
        }, 2000)
    }
}