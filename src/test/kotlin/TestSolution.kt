import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test


class TestExample {
    @Test
    fun basicTests() {
        assertEquals(listOf(1, 2), filterList(listOf(1, 2, 'a', 'b')), "For input [1, 2, 'a', 'b']")
        assertEquals(listOf(1, 0, 15), filterList(listOf(1, 'a', 'b', 0, 15)), "For input [1, 'a', 'b', 0, 15]")
        assertEquals(
            listOf(1, 2, 123),
            filterList(listOf(1, 2, "aasf", '1', "123", 123)),
            "For input [1, 2, 'aasf', '1', '123', 123]"
        )
    }
}
