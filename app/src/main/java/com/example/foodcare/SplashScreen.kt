package com.example.foodcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {

    private val delayTime = 3000L
    private lateinit var handler : Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        handler = Handler()

        handler.postDelayed({
            moveToNext()
        },delayTime)
    }

    private fun moveToNext(){

        val nextActivity = Intent(applicationContext, LandingActivity::class.java)
        startActivity(nextActivity)
        finish()
    }
}
