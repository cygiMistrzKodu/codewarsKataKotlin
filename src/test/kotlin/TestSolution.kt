package solution

import org.junit.jupiter.api.Test
import kotlin.math.abs
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FinanceTest {
    private fun testing(rate: Double, bal: Int, term: Int, num_payments: Int, expected: String) {
        val actual = Finance.amort(rate, bal, term, num_payments)
        assertEquals(expected, actual)
    }

    @Test
    fun test1() {
        testing(7.4, 10215, 24, 20, "num_payment 20 c 459 princ 445 int 14 balance 1809")
        testing(7.9, 107090, 48, 41, "num_payment 41 c 2609 princ 2476 int 133 balance 17794")
        testing(6.8, 105097, 36, 4, "num_payment 4 c 3235 princ 2685 int 550 balance 94447")
        testing(3.8, 48603, 24, 10, "num_payment 10 c 2106 princ 2009 int 98 balance 28799")
        testing(1.9, 182840, 48, 18, "num_payment 18 c 3959 princ 3769 int 189 balance 115897")

    }

    @Test
    fun calculation_Monthly_payment_testing() {
        assertEquals(Finance.calculateMonthlyPayment(7.4, 10215, 24), 459.20, 0.01)
        assertEquals(Finance.calculateMonthlyPayment(7.9, 107090, 48), 2609.35, 0.01)
        assertEquals(Finance.calculateMonthlyPayment(3.8, 48603, 24), 2106.25, 0.01)

    }

    @Test
    fun interestPrincNewBalanceTesting() {

        assertTrue(
            arraysEqualsWithEpsilon(
                doubleArrayOf(396.0075, 62.99, 9818.9925),
                Finance.interestPrincNewBalance(10215, 7.4, 1, 459.0),
                0.01
            )
        )

        assertTrue(
            arraysEqualsWithEpsilon(
                doubleArrayOf(445.30, 13.90, 1808.85),
                Finance.interestPrincNewBalance(10215, 7.4, 20, 459.20649006009677),
                0.01
            )
        )

    }

    private fun arraysEqualsWithEpsilon(expected: DoubleArray, actual: DoubleArray, epsilon: Double): Boolean {
        if (expected.size != actual.size) return false

        for (index in expected.indices) {
            if (abs(expected[index] - actual[index]) > epsilon) {
                return false
            }
        }

        return true
    }
}