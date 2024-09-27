import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class TestExample {
    @Test
    fun testFixed() {
        assertEquals("Right side wins!", alphabetWar("z"))
        assertEquals("Right side wins!", alphabetWar("zzzzs"))
        assertEquals("Left side wins!", alphabetWar("wwwwww"))
        assertEquals("Let's fight again!", alphabetWar("zdqmwpbs"))
    }
}
