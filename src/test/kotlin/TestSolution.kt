package besttravel

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfKTest {
    //----------------
    @Test
    fun basicTests1() {
        println("****** Basic Tests small numbers******")
        var ts = listOf(50, 55, 56, 57, 58)
        var n = chooseBestSum(163, 3, ts)
        assertEquals(163, n.toLong())
        ts = listOf(50)
        var m = chooseBestSum(163, 3, ts)
        assertEquals(-1, m)

    }

    @Test
    fun basicTestsAdditional() {
        println("****** Basic Tests my******")
        var ts = listOf(91, 74, 73, 85, 73, 81, 87)
        var n = chooseBestSum(331, 4, ts)
        assertEquals(331, n.toLong())
    }

    @Test
    fun basicTestsWhenShouldBeMinusOne() {
        println("****** when should be -1 ******")
        var ts = listOf(91, 74, 73, 85, 73, 81, 87)
        var n = chooseBestSum(331, 5, ts)
        assertEquals(-1, n.toLong())
    }

}