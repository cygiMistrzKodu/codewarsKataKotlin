package diophequa


import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class diophanteTest {
    @Test
    fun test2() {
        assertEquals("[[4, 1]]", solEquaStr(12))
    }

    @Test
    fun test3() {
        assertEquals("[[7, 3]]", solEquaStr(13))
    }

    @Test
    fun test11() {
        val a =
            "[[4505, 2252], [1503, 750], [647, 320], [505, 248], [415, 202], [353, 170], [225, 102], [153, 60], [135, 48], [103, 20], [97, 10], [95, 2]]"
        assertEquals(a, solEquaStr(9009))
    }

    @Test
    fun testWithNumber16() {
        assertEquals("[[4, 0]]", solEquaStr(16))
    }

    @Test
    fun testWhenNoSolutions() {
        val a =
            "[]"
        assertEquals(a, solEquaStr(9002))
    }

    @Test
    fun findFactorsForNumbersTest() {

        val expectedPairs = listOf(Pair(1L, 12L), Pair(2L, 6L), Pair(3L, 4L), Pair(4L, 3L), Pair(6L, 2L), Pair(12L, 1L))
        assertEquals(expectedPairs, findFactors(12L))

        val expectedPairs2 = listOf(Pair(1L, 6L), Pair(2L, 3L), Pair(3L, 2L), Pair(6L, 1L))
        assertEquals(expectedPairs2, findFactors(6L))

    }

    @Test
    fun iasIntegerTest() {
        assertTrue(isInteger(4.0))
        assertTrue(isInteger(8976.0))
        assertFalse(isInteger(4.5))
        assertFalse(isInteger(987.12))
        assertFalse(isInteger(1.02))

    }




}

