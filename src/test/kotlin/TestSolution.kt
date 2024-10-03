package valley

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class ValleyTest {
    //.................
    private fun testing(actual: String, expected: String) {
        assertEquals(expected, actual)
    }

    @Test
    fun test1() {
        println("Fixed Tests makeValley")
        var a = intArrayOf(17, 17, 15, 14, 8, 7, 7, 5, 4, 4, 1)
        var r = intArrayOf(17, 15, 8, 7, 4, 1, 4, 5, 7, 14, 17)
        testing(makeValley(a).contentToString(), r.contentToString())
        a = intArrayOf(20, 7, 6, 2)
        r = intArrayOf(20, 6, 2, 7)
        testing(makeValley(a).contentToString(), r.contentToString())

    }
}