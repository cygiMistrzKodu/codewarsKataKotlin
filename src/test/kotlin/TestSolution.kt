package solution


import org.junit.jupiter.api.Test
import java.math.BigInteger
import kotlin.test.assertEquals

class Suite2Test {

    @Test
    fun veryBigNumbersTest() {

        assertEquals("[20808]", Suite2.game(204))
        assertEquals("[651249, 2]", Suite2.game(807))
        assertEquals("[500000]", Suite2.game(1000))
        assertEquals("[2000000]", Suite2.game(2000))
        assertEquals("[12570098]", Suite2.game(5014))

    }

    @Test
    fun basicTests() {
        assertEquals("[32]", Suite2.game(8))
        assertEquals("[81, 2]", Suite2.game(9))
        assertEquals("[800]", Suite2.game(40))
        assertEquals("[10201, 2]", Suite2.game(101))

    }

    @Test
    fun myBasicTest() {
        assertEquals("[1, 2]", Suite2.game(1))
        assertEquals("[2]", Suite2.game(2))
        assertEquals("[9, 2]", Suite2.game(3))
        assertEquals("[8]", Suite2.game(4))
        assertEquals("[25, 2]", Suite2.game(5))
        assertEquals("[50]", Suite2.game(10))
        assertEquals("[200]", Suite2.game(20))
        assertEquals("[441, 2]", Suite2.game(21))
    }


    @Test
    fun findGreatestCommonDivisorTest() {
        assertEquals(BigInteger.valueOf(2), Suite2.findGreatestCommonDivisor(BigInteger.TWO, BigInteger.TWO))
        assertEquals(
            BigInteger.valueOf(4),
            Suite2.findGreatestCommonDivisor(BigInteger.valueOf(4), BigInteger.valueOf(4))
        )
        assertEquals(BigInteger.ONE, Suite2.findGreatestCommonDivisor(BigInteger.TWO, BigInteger.valueOf(7)))
        assertEquals(
            BigInteger.valueOf(4),
            Suite2.findGreatestCommonDivisor(BigInteger.valueOf(8), BigInteger.valueOf(12))
        )
        assertEquals(
            BigInteger.valueOf(4),
            Suite2.findGreatestCommonDivisor(BigInteger.valueOf(12), BigInteger.valueOf(8))
        )
        assertEquals(BigInteger.TWO, Suite2.findGreatestCommonDivisor(BigInteger.valueOf(86), BigInteger.valueOf(16)))
        assertEquals(BigInteger.TWO, Suite2.findGreatestCommonDivisor(BigInteger.TWO, BigInteger.ZERO))
        assertEquals(BigInteger.ONE, Suite2.findGreatestCommonDivisor(BigInteger.TWO, BigInteger.ONE))

    }

    @Test
    fun findLeastCommonMultipleForTwoDenominatorsTest() {

        assertEquals(BigInteger.TWO, Suite2.findLeastCommonMultiple(BigInteger.TWO, BigInteger.TWO))
        assertEquals(BigInteger.valueOf(4), Suite2.findLeastCommonMultiple(BigInteger.valueOf(4), BigInteger.TWO))
        assertEquals(
            BigInteger.valueOf(6),
            Suite2.findLeastCommonMultiple(BigInteger.valueOf(6), BigInteger.valueOf(2))
        )
        assertEquals(
            BigInteger.valueOf(14),
            Suite2.findLeastCommonMultiple(BigInteger.valueOf(7), BigInteger.valueOf(2))
        )
        assertEquals(
            BigInteger.valueOf(26),
            Suite2.findLeastCommonMultiple(BigInteger.valueOf(26), BigInteger.valueOf(13))
        )
        assertEquals(
            BigInteger.valueOf(26),
            Suite2.findLeastCommonMultiple(BigInteger.valueOf(13), BigInteger.valueOf(26))
        )
        assertEquals(
            BigInteger.valueOf(2),
            Suite2.findLeastCommonMultiple(BigInteger.valueOf(2), BigInteger.valueOf(1))
        )
        assertEquals(
            BigInteger.valueOf(0),
            Suite2.findLeastCommonMultiple(BigInteger.valueOf(2), BigInteger.valueOf(0))
        )

    }


    @Test
    fun findLeastCommonMultipleForManyDenominatorsTest() {
        assertEquals(BigInteger.valueOf(4), Suite2.findLeastCommonMultipleMany(listOf(2, 4, 2)))
        assertEquals(BigInteger.valueOf(360), Suite2.findLeastCommonMultipleMany(listOf(4, 6, 8, 12, 15, 18, 20, 24)))
        assertEquals(BigInteger.valueOf(12), Suite2.findLeastCommonMultipleMany(listOf(2, 3, 3, 4)))
        assertEquals(BigInteger.valueOf(2), Suite2.findLeastCommonMultipleMany(listOf(2)))

    }


}

