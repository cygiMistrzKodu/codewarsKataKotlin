package allinclusive


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class rotationsMainTest {
    private fun testing(actual:Boolean, expected:Boolean) {
        assertEquals(expected, actual)
    }
    @Test
    fun test() {
        println("Fixed Tests containAllRots")
        var a = arrayListOf("bsjq", "qbsj", "sjqb", "twZNsslC", "jqbs")
        testing(containAllRots("bsjq", a), true)
        a = arrayListOf("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY")
        testing(containAllRots("XjYABhR", a), false)

    }
}
