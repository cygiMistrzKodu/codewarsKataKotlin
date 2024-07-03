import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class TestExample {
    @Test
    fun `Basic tests`() {
        assertEquals(65, getAscii('A'))
        assertEquals(32, getAscii(' '))
        assertEquals(33, getAscii('!'))
    }
}