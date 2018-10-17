package com.example.quatro.churrascore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        GlideApp.with(this)
                .load("https://trazmais1.com.br/178-large_default/glacial-cerveja-lata-350ml.jpg")
                .placeholder(R.mipmap.logo)
                .into(splashlogo)

        Handler().postDelayed({

            val main = Intent(this, MainActivity::class.java)
            startActivity(main)
            finish()

        }, 2000)
    }
}
