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
        testing(0.0001, "[10000, 3.1414926536]")
        testing(0.00004, "[25000, 3.1415526536]")
        testing(7.000000000000001E-5, "[14286, 3.1415226550]")

    }
}