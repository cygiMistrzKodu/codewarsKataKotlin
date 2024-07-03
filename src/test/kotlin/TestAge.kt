import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class LengthTest {

    @Test
    fun testStringLength() {
        val strangeString = STRANGE_STRING
        val upAndDown = strangeString.uppercase().lowercase()
        val origLen = strangeString.length
        val upDownLen = upAndDown.length

        val message = "String length should grow"
        val growMessage = "$message, actual length: $origLen ⇒ $upDownLen"

        assertTrue(upDownLen > origLen, growMessage)
    }
}