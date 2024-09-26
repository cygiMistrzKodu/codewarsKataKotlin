package solution

import java.math.BigInteger

object Diagonal {

    fun diagonal(n: Int, p: Int): BigInteger {

        return (p..n).map { row ->
            elementOfDiagonalFromRow(row, p)
        }.reduce { sum, number -> sum + number }

    }

    fun elementOfDiagonalFromRow(depth: Int, diagonalNumber: Int): BigInteger {
        return binomialCoefficient(depth, diagonalNumber)
    }

    fun binomialCoefficient(n: Int, k: Int): BigInteger {
        var coefficient: BigInteger = BigInteger.ONE

        var kSubSet = k
        if (kSubSet > n - kSubSet) {
            kSubSet = n - kSubSet
        }
        for (i in 0 until kSubSet) {
            coefficient *= (n - i).toBigInteger()
            coefficient /= (i + 1).toBigInteger()
        }
        return coefficient
    }

}
