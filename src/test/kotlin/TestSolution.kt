import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertEquals

class KotlinTricks0 {
    @Test
    fun testInt() {
        val r = Random(System.currentTimeMillis())
        (0..100).forEach { r.nextInt().let { assertEquals(it, kotlin.Int(it.toString())) } }
    }
}