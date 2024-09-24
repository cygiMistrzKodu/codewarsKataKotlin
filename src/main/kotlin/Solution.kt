package solution

import java.math.BigInteger

object Diagonal {

    fun diagonal(n: Int, p: Int): BigInteger {

        val pascalTriangle = createPascalTriangle(n + 1)

        return  (p..n).map { index ->
            pascalTriangle[index][p]

        }.reduce { sum, number -> sum + number }


    }

    fun createPascalTriangle(levels: Int): List<List<BigInteger>> {

        val pascalTriangle: MutableList<MutableList<BigInteger>> = mutableListOf()

        if (levels >= 1) {
            pascalTriangle.add(mutableListOf(BigInteger.ONE))
        }

        if (levels >= 2) {
            pascalTriangle.add(mutableListOf(BigInteger.ONE, BigInteger.ONE))
        }

        if (levels >= 3) {

            (3..levels).map {
                val nextLevel =
                    listOf(BigInteger.ONE) + pascalTriangle.last()
                        .zipWithNext() { a, b -> a + b } + listOf(BigInteger.ONE)
                pascalTriangle.add(nextLevel.toMutableList())

            }
        }
        return pascalTriangle

    }

}