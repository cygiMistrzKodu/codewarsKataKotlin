package solution

import java.math.BigInteger

object Diagonal {

    fun diagonal(n: Int, p: Int): BigInteger {

        return (p..n).map { row ->
            partOfDiagonalFromRow(row, p)
        }.reduce { sum, number -> sum + number }


    }

    fun partOfDiagonalFromRow(n: Int, diagonalPart: Int): BigInteger {
        return (diagonalPart..diagonalPart).map { k -> binomialCoefficient(n, k) }[0]
    }

    private fun binomialCoefficient(n: Int, k: Int): BigInteger {
        return factorial(n) / (factorial(k) * factorial(n - k))
    }

    private fun factorial(num: Int): BigInteger {
        return if (num == 0) BigInteger.ONE else (1..num).map { BigInteger.valueOf(it.toLong()) }
            .reduce { acc, i -> acc * i }
    }

}