package ball

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class ballMainTest {
    private fun testing(actual:Int, expected:Int) {
        assertEquals(expected.toLong(), actual.toLong())
    }

    @Test
    fun test() {
        println("Fixed Tests maxBall")
        testing(maxBall(37), 10)
        testing(maxBall(45), 13)

    }

}