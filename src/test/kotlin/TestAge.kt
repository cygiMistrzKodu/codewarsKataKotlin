package catmouse

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CatMouseTests {

    @Test
    fun basicTests() {
        assertEquals("Escaped!", catMouse("C....m"))
        assertEquals("Caught!", catMouse("C..m"))
        assertEquals("Escaped!", catMouse("C.....m"))
        assertEquals("Caught!", catMouse("C.m"))
    }
}