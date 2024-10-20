package thirteen

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ThirteenTest {
    @Test
    fun test1() {
        println("Fixed Tests: thirt")
        testing(thirt(8529), 79)
        testing(thirt(85299258), 31)

    }
    companion object {
        private fun testing(actual:Long, expected:Long) {
            assertEquals(expected, actual)
        }
    }

    @Test
    fun getRemindersOf13ByDigitOrderTest() {
        assertEquals(1, getRemindersOf13ByDigitOrder(0))
        assertEquals(10, getRemindersOf13ByDigitOrder(1))
        assertEquals(3, getRemindersOf13ByDigitOrder(4))
        assertEquals(1, getRemindersOf13ByDigitOrder(6))
        assertEquals(10, getRemindersOf13ByDigitOrder(7))
        assertEquals(12, getRemindersOf13ByDigitOrder(15))
        assertEquals(10, getRemindersOf13ByDigitOrder(25))
    }

    @Test
    fun sumProductsBy13DivisibilityCycleTest() {
        assertEquals(178, sumProductsBy13DivisibilityCycle(1234567))
        assertEquals(87, sumProductsBy13DivisibilityCycle(178))
        assertEquals(87, sumProductsBy13DivisibilityCycle(87))
    }
}