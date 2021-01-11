package com.getdonate.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.getdonate.BaseActivity
import com.getdonate.R

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_splash)

        Handler(Looper.getMainLooper()).postDelayed({

            startActivity(Intent(this, HomeActivity::class.java))
            finish()

        }, SPLASH_TIME_OUT)
    }

    override fun onBackPressed() {
//        super.onBackPressed()
    }

    companion object {
        const val SPLASH_TIME_OUT = 5000L
    }
}