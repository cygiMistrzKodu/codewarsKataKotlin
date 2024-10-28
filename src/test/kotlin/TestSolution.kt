import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun basicTests() {
        assertArrayEquals(intArrayOf(6, 24), Solution.nameValue(arrayOf("abc", "abc abc")))
        assertArrayEquals(intArrayOf(88, 12, 225), Solution.nameValue(arrayOf("codewars", "abc", "xyz")))
        assertArrayEquals(
            intArrayOf(351, 282, 330),
            Solution.nameValue(arrayOf("abcdefghijklmnopqrstuvwxyz", "stamford bridge", "haskellers"))
        )
    }
}