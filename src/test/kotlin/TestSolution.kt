package com.codewars.hybris95

import org.junit.jupiter.api.Test
import kotlin.test.junit5.JUnit5Asserter.assertTrue


class LeetspeakTest {

    internal var myEncoder: Leetspeak = Leetspeak()

    @Test
    fun simpleTest() {
        assertTrue("object null", myEncoder.encode(null) == "")
        assertTrue("empty string", myEncoder.encode("") == "")
        assertTrue("abcdef string", myEncoder.encode("abcdef") == "4bcd3f")
        assertTrue("AbcdEf string wih big numbers", myEncoder.encode("AbcdEf") == "4bcd3f")
    }
}
