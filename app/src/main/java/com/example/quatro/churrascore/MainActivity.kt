package com.example.quatro.churrascore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTruco.setOnClickListener {
            val truco = Intent(this, Truco::class.java)
            startActivity(truco)
        }

        btnFutebol.setOnClickListener {
            val futebol = Intent(this, Futebol::class.java)
            startActivity(futebol)
        }

        btnPebolim.setOnClickListener {
            val pebolim = Intent(this, Pebolim::class.java)
            startActivity(pebolim)
        }
    }





}
