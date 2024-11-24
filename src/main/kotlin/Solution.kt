package solution

import java.math.BigInteger

object Suite2 {
    fun game(n: Long): String {

        return if (n % 2 == 0L) "[${n * n / 2}]" else "[${n * n}, 2]"
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
