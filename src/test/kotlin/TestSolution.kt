package solution


import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Suite2Test {

    @Test
    fun basicTests() {
        assertEquals("[800]", Suite2.game(40))
        assertEquals("[10201, 2]", Suite2.game(101))

    }
}