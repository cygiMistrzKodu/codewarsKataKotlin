package solution

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class  PiApproxTest {

    private fun testing(epsilon: Double, expect: String) {
        val actual: String = PiApprox.iterPi2String(epsilon)
        assertEquals(expect, actual)
    }
    @Test
    fun basicTests() {
        testing(0.1, "[10, 3.0418396189]")
        testing(0.01, "[100, 3.1315929036]")
        testing(0.001, "[1000, 3.1405926538]")

    }
}