package solution

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue


class MatchSubstTest {
    private fun dotest(s: String, prog: String, version: String, exp: String) {
        val ans = MatchSubst.change(s, prog, version)
        assertEquals(exp, ans)
    }

    @Test
    fun test() {
        println("Basic Tests");
        val s1 = "Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-0091\nDate: Tues April 9, 2005\nVersion: 6.7\nLevel: Alpha"
        dotest(s1, "Ladder", "1.1", "Program: Ladder Author: g964 Phone: +1-503-555-0090 Date: 2019-01-01 Version: 1.1")

        val s14 = "Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-0091\nDate: Tues April 9, 2005\nVersion: 6.7.5\nLevel: Alpha"
        dotest(s14, "Ladder", "1.1", "ERROR: VERSION or PHONE")

        val s2 = "Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-0091\nDate: Tues April 9, 2005\nVersion: 2.0\nLevel: Alpha"
        dotest(s2, "Ladder", "1.1", "Program: Ladder Author: g964 Phone: +1-503-555-0090 Date: 2019-01-01 Version: 2.0")

    }

    @Test
    fun positivistCase() {

        val s1 = "Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-0091\nDate: Tues April 9, 2005\nVersion: 6.7\nLevel: Alpha"
        val expected = "Program: Ladder Author: g964 Phone: +1-503-555-0090 Date: 2019-01-01 Version: 1.1"
        dotest(s1, "Ladder", "1.1", expected)

    }

    @Test
    fun phoneValidFormatTest() {
        assertTrue(MatchSubst.isPhoneValid("+1-503-555-0090"),"Phone is not in valid form")
        assertFalse(MatchSubst.isPhoneValid("+1-50-55-0090"),"Phone is not valid")

    }

    @Test
    fun versionValidFormatTest() {
        assertTrue(MatchSubst.isVersionValid("14.275"),"Version valid")
        assertFalse(MatchSubst.isVersionValid(".9"),"Version is not Valid")
        assertFalse(MatchSubst.isVersionValid("7"),"Version is not Valid")
    }

    @Test
    fun getPhoneLineTest() {
        val s1 = "Program title: Primes\n" +
                "Author: Kern\n" +
                "Corporation: Gold\n" +
                "Phone: +1-503-555-0091\n" +
                "Date: Tues April 9, 2005\n" +
                "Version: 6.7\n" +
                "Level: Alpha"

        assertEquals("Phone: +1-503-555-0091",MatchSubst.getPhoneLine(s1))
    }

    @Test
    fun getVersionLineTest() {
        val s1 = "Program title: Primes\n" +
                "Author: Kern\n" +
                "Corporation: Gold\n" +
                "Phone: +1-503-555-0091\n" +
                "Date: Tues April 9, 2005\n" +
                "Version: 6.7\n" +
                "Level: Alpha"

        assertEquals("Version: 6.7",MatchSubst.getVersionLine(s1))
    }

    @Test
    fun getElementFromLineTest() {
        assertEquals("+1-503-555-0091",MatchSubst.getElementFromLine("Phone: +1-503-555-0091"))
        assertEquals("",MatchSubst.getElementFromLine("Phone"))

    }

    @Test
    fun getVersionFromLineTest() {
        assertEquals("6.7",MatchSubst.getElementFromLine("Version: 6.7"))
        assertEquals("",MatchSubst.getElementFromLine("version"))

    }








}