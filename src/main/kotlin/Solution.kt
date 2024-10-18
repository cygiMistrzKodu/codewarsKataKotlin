package com.codewars.hybris95

class Leetspeak : Encoder() {

    private val translator = mapOf(
        "a" to "4",
        "e" to "3",
        "l" to "1",
        "m" to "/^^\\",
        "o" to "0",
        "u" to "(_)"
    )

    override fun encode(source: String?): String {

        return (source ?: "").toList().map { translator.getOrDefault(it.lowercase(), it) }.joinToString("")

    }
}

abstract class Encoder {
    abstract fun encode(source: String?): String
}
