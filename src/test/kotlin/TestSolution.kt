package hero

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IntSqRootTest {
    @Test
    fun test0() {
        println("Fixed Tests")
        assertEquals(4, intRac(25, 1));
        assertEquals(3, intRac(125348, 300));
        assertEquals(5, intRac(16000, 400));
        assertEquals(16, intRac(11409767, 1));

    }

}
