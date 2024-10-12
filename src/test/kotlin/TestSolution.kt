import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class TestExample {
    @Test
    fun testFixed() {
        assertEquals(1, digPow(89, 1))
        assertEquals(-1, digPow(92, 1))
        assertEquals(51, digPow(46288, 3))
    }

    @Test
    fun splitOnDigitsTest() {
        assertEquals(listOf(1, 2, 3), splitOnDigits(123))
        assertEquals(listOf(4, 6, 2, 8, 8), splitOnDigits(46288))
    }

    @Test
    fun riseToConsecutivePowerTest() {
        assertEquals(listOf(1, 4, 27), riseToConsecutivePowers(listOf(1, 2, 3), 1))
        assertEquals(listOf(4, 125, 4096), riseToConsecutivePowers(listOf(2, 5, 8), 2))
    }

    @Test
    fun makeConsecutivePowersFromStartToEndTest() {
        assertEquals(listOf(2, 3, 4, 5, 6), makePowersAsManyAsDigits(2, 5))
        assertEquals(listOf(1), makePowersAsManyAsDigits(1, 1))
        assertEquals(listOf(0), makePowersAsManyAsDigits(0, 1))
        assertEquals(listOf(-2, -1), makePowersAsManyAsDigits(-2, 2))
        assertEquals(listOf(2,3,4), makePowersAsManyAsDigits(2, 3))
    }


}