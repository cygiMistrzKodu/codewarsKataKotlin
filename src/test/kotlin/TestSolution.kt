package kprimes



import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.util.Arrays


class KPrimesTest {
    private fun testing(act:String, exp:String) {
        assertEquals(exp, act)
    }
    @Test
    fun test1() {
        println("Basic Tests")
        testing(Arrays.toString(countKprimes(2, 0, 100)),
            Arrays.toString(longArrayOf(4, 6, 9, 10, 14, 15, 21, 22, 25, 26, 33, 34, 35, 38, 39, 46, 49, 51, 55, 57, 58, 62, 65, 69, 74, 77, 82, 85, 86, 87, 91, 93, 94, 95)))
        testing(Arrays.toString(countKprimes(3, 0, 100)),
            Arrays.toString(longArrayOf(8, 12, 18, 20, 27, 28, 30, 42, 44, 45, 50, 52, 63, 66, 68, 70, 75, 76, 78, 92, 98, 99)))

    }

    @Test
    fun isKprimeTest() {
        assertTrue(isKPrimeMultiFactorAllow(15,2))
        assertTrue(isKPrimeMultiFactorAllow(4,2))
        assertTrue(isKPrimeMultiFactorAllow(6,2))
        assertTrue(isKPrimeMultiFactorAllow(9,2))
    }

    @Test
    fun puzzleTest() {
        assertEquals(16, puzzle(428))
        assertEquals(92, puzzle(634))
        assertEquals(68, puzzle(455))
        assertEquals(40, puzzle(534))
        assertEquals(16, puzzle(328))
    }

}
