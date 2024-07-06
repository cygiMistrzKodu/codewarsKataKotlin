package hero

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IntSqRootTest {
    @Test
    fun test0() {
        println("Fixed Tests")
        assertEquals(4, intRac(25, 1));
        assertEquals(3, intRac(125348, 300));

    }

}
