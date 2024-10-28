package com.codewars.geoffp

object UnwantedDollars {
    fun moneyValue(money: String): Double {

        if (!money.contains("\\d+".toRegex())){
            return 0.0
        }

        if (money.contains("$")) {
            return money.replace("$", "")
                .replace(" ","").toDouble()
        }


        return money.toDouble()
    }
}