package solution

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FixStringCaseSolutionTest {
    @Test
    fun BasicTests() {
        assertEquals("code", FixStringCase.solve("code"))
        assertEquals("CODE", FixStringCase.solve("CODe"))
        assertEquals("code", FixStringCase.solve("COde"))
        assertEquals("code", FixStringCase.solve("Code"))
        assertEquals("", FixStringCase.solve(""))
    }
}