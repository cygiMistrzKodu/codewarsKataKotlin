package solution

import kotlin.math.pow
import kotlin.math.round

object Finance {

    fun amort(rate: Double, bal: Int, term: Int, num_payments: Int): String {

        val c = calculateMonthlyPayment(rate, bal, term)
        val (princ, int, newBalance) = interestPrincNewBalance(bal, rate, num_payments, c)

        return "num_payment $num_payments c ${round(c).toInt()} princ " +
                "${round(princ).toInt()} int ${round(int).toInt()} balance ${
            round(
                newBalance
            ).toInt()
        }"
    }

    fun calculateMonthlyPayment(rate: Double, bal: Int, term: Int): Double {

        val r = (rate / 100) / 12
        val n = r * bal
        val d = 1 - ((1 + r)).pow(-term)

        return (n / d)
    }

    fun interestPrincNewBalance(
        balance: Int,
        rate: Double,
        numPayment: Int,
        monthlyPayment: Double
    ): DoubleArray {


        val r = (rate / 100) / 12
        var newBalance = balance.toDouble()

        var monthInterest = 0.0
        var princ = 0.0
        for (i in 1..numPayment) {
            monthInterest = r * newBalance
            princ = monthlyPayment - monthInterest
            newBalance -= princ

        }
        return doubleArrayOf(princ, monthInterest, newBalance)
    }
}