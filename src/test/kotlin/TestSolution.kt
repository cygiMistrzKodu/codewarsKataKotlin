package besttravel

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfKTest {
    //----------------
    @Test
    fun BasicTests1() {
        println("****** Basic Tests small numbers******")
        var ts = listOf(50, 55, 56, 57, 58)
        var n = chooseBestSum(163, 3, ts)
        assertEquals(163, n.toLong())
        ts = listOf(50)
        var m = chooseBestSum(163, 3, ts)
        assertEquals(-1, m)

    }

}