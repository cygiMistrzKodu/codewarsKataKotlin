import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestExample {
    @Test
    fun testFixed() {
        assertEquals("Right side wins!", alphabetWar("z"))
        assertEquals("Let's fight again!", alphabetWar("****"))
        assertEquals("Let's fight again!", alphabetWar("z*dq*mw*pb*s"))
        assertEquals("Let's fight again!", alphabetWar("zdqmwpbs"))
        assertEquals("Right side wins!", alphabetWar("zz*zzs"))
        assertEquals("Left side wins!", alphabetWar("sz**z**zs"))
        assertEquals("Left side wins!", alphabetWar("z*z*z*zs"))
        assertEquals("Left side wins!", alphabetWar("*wwwwww*z*"))
    }
}
