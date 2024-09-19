package solution

import org.junit.jupiter.api.Test
import java.math.BigInteger
import kotlin.test.assertEquals

class DiagonalTest {

    @Test
    fun basicTests() {
        assertEquals(BigInteger.valueOf(5985), Diagonal.diagonal(20, 3))
        assertEquals(BigInteger.valueOf(20349), Diagonal.diagonal(20, 4))
        assertEquals(BigInteger.valueOf(54264), Diagonal.diagonal(20, 5))

    }
}