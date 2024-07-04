package com.codewars.apartridge

import kotlin.math.floor

object CodewarsLeaderboardClimber {
    fun leaderBoard(user: String, userScore: Int, yourScore: Int): String {

        if (yourScore > userScore) {
            return "Winning!"
        }

        if (yourScore == userScore) {
            return "Only need one!"

        }

        val pointsToEven = userScore - yourScore
        val betaKata = (floor(((pointsToEven) / 3).toDouble())).toInt()
        val eightKyuKata = (pointsToEven - betaKata * 3)

        var dammit = ""

        if (betaKata + eightKyuKata > 1000) {
            dammit = " Dammit!"
        }

        return "To beat $user's score, I must complete $betaKata Beta kata and $eightKyuKata 8kyu kata.$dammit"
    }
}