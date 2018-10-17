package com.example.quatro.churrascore

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_vitoria.*

class VitoriaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vitoria)

        val nomeTime = intent.getStringExtra("time")

        val name = "Vitoria " + nomeTime

        timeVitoria.text = name

    }
}
