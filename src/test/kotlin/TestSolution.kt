import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestKata {
    @Test
    fun basicTests() {
        assertEquals(listOf("A       b    ", "a       B    "), wave("a       b    "))
        assertEquals(
            listOf(
                "This is a few words",
                "tHis is a few words",
                "thIs is a few words",
                "thiS is a few words",
                "this Is a few words",
                "this iS a few words",
                "this is A few words",
                "this is a Few words",
                "this is a fEw words",
                "this is a feW words",
                "this is a few Words",
                "this is a few wOrds",
                "this is a few woRds",
                "this is a few worDs",
                "this is a few wordS"
            ), wave("this is a few words")
        )
        assertEquals(listOf<String>(), wave(""))
        assertEquals(listOf(" Gap ", " gAp ", " gaP "), wave(" gap "))
    }

    @Test
    fun myTest() {
        assertEquals(listOf<String>(), wave(""))
        assertEquals(listOf("A"), wave("a"))
        assertEquals(listOf("Ab", "aB"), wave("ab"))
        assertEquals(listOf("Abc", "aBc", "abC"), wave("abc"))
        assertEquals(listOf(" Gap ", " gAp ", " gaP "), wave(" gap "))
    }
}