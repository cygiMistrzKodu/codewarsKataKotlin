import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class TestExample {
    @Test
    fun testFixed() {
        assertEquals(1, digPow(89, 1))
        assertEquals(-1, digPow(92, 1))
        assertEquals(51, digPow(46288, 3))
    }
}