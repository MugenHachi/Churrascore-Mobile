package com.example.quatro.churrascore

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pebolim.*
import kotlinx.android.synthetic.main.activity_truco.*

class Truco : AppCompatActivity() {

    var team1Score = 0
    var team2Score = 0
    var team1Wins = 0
    var team2Wins = 0
    var currentTeam = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_truco)

        ScorePlus1Tru.setOnClickListener() {
            if(currentTeam) {
                team1Score++
            } else {
                team2Score++
            }

            Team1ScoreTru.text = team1Score.toString()
            Team2ScoreTru.text = team2Score.toString()

            CheckScore()
        }

        ScoreMinus1Tru.setOnClickListener() {
            if(currentTeam) {
                if (team1Score > 0) {
                    team1Score--
                }

            } else {
                if (team2Score > 0) {
                    team2Score--
                }
            }

            Team1ScoreTru.text = team1Score.toString()
            Team2ScoreTru.text = team2Score.toString()

        }

        ScorePlus3.setOnClickListener() {
            if(currentTeam) {
                team1Score += 3
            } else {
                team2Score += 3
            }

            Team1ScoreTru.text = team1Score.toString()
            Team2ScoreTru.text = team2Score.toString()

            CheckScore()
        }

        ScorePlus6.setOnClickListener() {
            if(currentTeam) {
                team1Score += 6
            } else {
                team2Score += 6
            }

            Team1ScoreTru.text = team1Score.toString()
            Team2ScoreTru.text = team2Score.toString()

            CheckScore()
        }

        ScorePlus9.setOnClickListener() {
            if(currentTeam) {
                team1Score += 9
            } else {
                team2Score += 9
            }

            Team1ScoreTru.text = team1Score.toString()
            Team2ScoreTru.text = team2Score.toString()

            CheckScore()
        }
        ScorePlus12.setOnClickListener() {
            if(currentTeam) {
                team1Score += 12
            } else {
                team2Score += 12
            }

            Team1ScoreTru.text = team1Score.toString()
            Team2ScoreTru.text = team2Score.toString()

            CheckScore()
        }

Team1ScoreTru.setOnClickListener() {
    currentTeam = true
    Team1ScoreTru.setBackgroundColor(resources.getColor(R.color.colorPrimary))
    Team2ScoreTru.setBackgroundColor(resources.getColor(R.color.colorAccent))
}

Team2ScoreTru.setOnClickListener() {
    currentTeam = false
    Team2ScoreTru.setBackgroundColor(resources.getColor(R.color.colorPrimary))
    Team1ScoreTru.setBackgroundColor(resources.getColor(R.color.colorAccent))
}
}

    fun CheckScore() {
        if(team1Score >= 12) {
            team1Score = 0
            team1Wins++
            Team1Wins.text = "Vitorias: " + team1Wins.toString()
            Team1ScoreTru.text = team1Score.toString()
        }
        if(team2Score >= 12) {
            team2Score = 0
            team2Wins++
            Team2Wins.text = "Vitorias: " + team2Wins.toString()
            Team2ScoreTru.text = team2Score.toString()
        }
    }
}
