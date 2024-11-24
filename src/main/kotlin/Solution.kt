package solution

import java.math.BigInteger

object Suite2 {
    fun game(n: Long): String {

        val numerators: MutableList<Long> = mutableListOf()
        for (rowPosition in 1L..n) {
            numerators.add(rowPosition)
        }

        var leastCommonMultiply = BigInteger.ONE
        for (rowPosition in 1L..n) {
            for (columnPosition in 1L..n) {

                leastCommonMultiply = findLeastCommonMultiple(
                    leastCommonMultiply,
                    (rowPosition + columnPosition).toBigInteger()
                )

            }

        }

        var numeratorSum = BigInteger.ZERO
        var index = 0
        for (rowPosition in 1L..n) {
            for (columnPosition in 1L..n) {


                val denominator = (rowPosition + columnPosition).toBigInteger()
                val numeratorMultiplier = leastCommonMultiply / denominator
                numeratorSum += numerators[index % numerators.size].toBigInteger() * numeratorMultiplier
                index++

            }

        }

        val gcd = findGreatestCommonDivisor(numeratorSum, leastCommonMultiply)

        val numeratorShortened = numeratorSum / gcd
        val denominatorShortened = leastCommonMultiply / gcd

        if (denominatorShortened == BigInteger.ONE) {
            return "[${numeratorShortened.toLong()}]"
        }

        return "[${numeratorShortened.toLong()}, ${denominatorShortened.toLong()}]"

    }

    fun findGreatestCommonDivisor(denominator: BigInteger, otherDenominator: BigInteger): BigInteger {
        return if (otherDenominator == BigInteger.ZERO) denominator
        else findGreatestCommonDivisor(otherDenominator, denominator % otherDenominator)

    }

    fun findLeastCommonMultiple(denominator: BigInteger, otherDenominator: BigInteger): BigInteger {
        return denominator / findGreatestCommonDivisor(denominator, otherDenominator) * otherDenominator
    }

    fun findLeastCommonMultipleMany(listOfDenominators: List<Long>): BigInteger {
        return listOfDenominators.fold(BigInteger.ONE) { lcm, denominator ->
            findLeastCommonMultiple(lcm, denominator.toBigInteger())
        }
    }
}
