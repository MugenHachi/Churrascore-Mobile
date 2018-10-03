package com.example.quatro.churrascore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pebolim.*

class Pebolim : AppCompatActivity() {

    var team1Score = 0
    var team2Score = 0
    var currentTeam = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pebolim)

        ScorePlus1.setOnClickListener() {
            if(currentTeam) {
                team1Score++
            } else {
                team2Score++
            }

            Team1Score.text = team1Score.toString()
            Team2Score.text = team2Score.toString()
        }

        ScoreMinus1.setOnClickListener() {
            if(currentTeam) {
                team1Score--
            } else {
                team2Score--
            }

            Team1Score.text = team1Score.toString()
            Team2Score.text = team2Score.toString()
        }

        Team1Score.setOnClickListener() {
            currentTeam = true
            Team1Score.setBackgroundColor(resources.getColor(R.color.colorPrimary))
            Team2Score.setBackgroundColor(resources.getColor(R.color.colorAccent))
        }

        Team2Score.setOnClickListener() {
            currentTeam = false
            Team2Score.setBackgroundColor(resources.getColor(R.color.colorPrimary))
            Team1Score.setBackgroundColor(resources.getColor(R.color.colorAccent))
        }
    }
}
