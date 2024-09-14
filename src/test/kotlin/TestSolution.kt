package bouncing

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class BouncingBallTest {
    @Test
    fun heightZeroThenMinusOne() {
        assertEquals(-1, bouncingBall(0.0, 0.66, 1.5))
    }

    @Test
    fun boundLessThanEqualZeroThenMinusOne() {
        assertEquals(-1, bouncingBall(3.0, 0.0, 1.5))
    }

    @Test
    fun boundGraterThanOneThenMinusOne() {
        assertEquals(-1, bouncingBall(3.0, 1.2, 1.5))
    }

    @Test
    fun windowsParameterEqualHeightThenMinusOne() {
        assertEquals(-1, bouncingBall(3.0, 1.2, 3.0))
    }

    @Test
    fun windowsParameterGreaterThanHeightTHenMinusOne() {
        assertEquals(-1, bouncingBall(3.0, 0.8, 3.5))
    }

    @Test
    fun test1() {
        assertEquals(3, bouncingBall(3.0, 0.66, 1.5))
    }
    @Test
    fun test2() {
        assertEquals(15, bouncingBall(30.0, 0.66, 1.5))
    }

    @Test
    fun test3() {
        assertEquals(1, bouncingBall(2.0, 0.5, 1.0))
    }

}