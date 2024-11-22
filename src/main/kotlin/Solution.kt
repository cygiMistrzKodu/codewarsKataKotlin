package solution

import java.math.BigInteger

object Suite2 {
    fun game(n: Long): String {

        val denominators: MutableList<Long> = mutableListOf()
        val numerators: MutableList<Long> = mutableListOf()
        for (rowPosition in 1L..n) {

            numerators.add(rowPosition)

            for (columnPosition in 1L..n) {

                denominators.add(rowPosition + columnPosition)

            }

        }

        val leastCommonMultiply = findLeastCommonMultipleMany(denominators)
        val numeratorsMultipliers = denominators.map { leastCommonMultiply / it.toBigInteger() }.toList()
        val numeratorSum =
            numeratorsMultipliers.foldIndexed(BigInteger.ZERO) { index, numeratorsSum, multiplier ->
                numeratorsSum + (numerators[index % numerators.size].toBigInteger() * multiplier)
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
