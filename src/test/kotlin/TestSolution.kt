package solution

import org.junit.jupiter.api.Test
import java.math.BigInteger
import kotlin.test.assertEquals

class DiagonalTest {


    @Test
    fun whenLineOneThenPascalTriangleHaveOne() {
        assertEquals(
            mutableListOf(
                mutableListOf(BigInteger.ONE)
            ), Diagonal.createPascalTriangle(1)
        )
    }

    @Test
    fun whenLineOneThenPascalTriangleHaveTwoLevels() {
        assertEquals(
            mutableListOf(
                mutableListOf(BigInteger.ONE),
                mutableListOf(BigInteger.ONE, BigInteger.ONE)
            ), Diagonal.createPascalTriangle(2)
        )
    }

    @Test
    fun pascalTriangleLevelsThree() {
        assertEquals(
            mutableListOf(
                mutableListOf(BigInteger.ONE),
                mutableListOf(BigInteger.ONE, BigInteger.ONE),
                mutableListOf(BigInteger.ONE, BigInteger.TWO, BigInteger.ONE)
            ), Diagonal.createPascalTriangle(3)
        )
    }

    @Test
    fun pascalTriangleLevelsFour() {
        assertEquals(
            mutableListOf(
                mutableListOf(BigInteger.ONE),
                mutableListOf(BigInteger.ONE, BigInteger.ONE),
                mutableListOf(BigInteger.ONE, BigInteger.TWO, BigInteger.ONE),
                mutableListOf(
                    BigInteger.ONE, BigInteger.valueOf(3),
                    BigInteger.valueOf(3), BigInteger.ONE
                )
            ), Diagonal.createPascalTriangle(4)
        )
    }

    @Test
    fun pascalTriangleLevelsFive() {
        assertEquals(
            mutableListOf(
                mutableListOf(BigInteger.ONE),
                mutableListOf(BigInteger.ONE, BigInteger.ONE),
                mutableListOf(BigInteger.ONE, BigInteger.TWO, BigInteger.ONE),
                mutableListOf(
                    BigInteger.ONE, BigInteger.valueOf(3),
                    BigInteger.valueOf(3), BigInteger.ONE
                ),
                mutableListOf(
                    BigInteger.ONE, BigInteger.valueOf(4), BigInteger.valueOf(6), BigInteger.valueOf(4),
                    BigInteger.ONE
                )
            ), Diagonal.createPascalTriangle(5)
        )
    }


    @Test
    fun when1And0ThenDiagonalSum2() {
        assertEquals(BigInteger.valueOf(2), Diagonal.diagonal(1, 0))
    }

    @Test
    fun when2And0ThenDiagonalSum3() {
        assertEquals(BigInteger.valueOf(3), Diagonal.diagonal(2, 0))
    }

    @Test
    fun when3And0ThenDiagonalSum4() {
        assertEquals(BigInteger.valueOf(4), Diagonal.diagonal(3, 0))
    }

    @Test
    fun when2And1ThenDiagonalSum3() {
        assertEquals(BigInteger.valueOf(3), Diagonal.diagonal(2, 1))
    }

    @Test
    fun when3And1ThenDiagonalSum6() {
        assertEquals(BigInteger.valueOf(6), Diagonal.diagonal(3, 1))
    }

    @Test
    fun when3And2ThenDiagonalSum4() {
        assertEquals(BigInteger.valueOf(4), Diagonal.diagonal(3, 2))
    }

    @Test
    fun when4And0ThenDiagonalSum4() {
        assertEquals(BigInteger.valueOf(5), Diagonal.diagonal(4, 0))
    }

    @Test
    fun basicTests() {
        assertEquals(BigInteger.valueOf(5985), Diagonal.diagonal(20, 3))
        assertEquals(BigInteger.valueOf(20349), Diagonal.diagonal(20, 4))
        assertEquals(BigInteger.valueOf(54264), Diagonal.diagonal(20, 5))

    }
}