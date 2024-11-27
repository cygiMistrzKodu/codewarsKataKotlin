package solution

object Opstrings {

    fun vertMirror(strng: String): String {
        return strng.split("\n").joinToString("\n") { it.reversed() }
    }

    fun horMirror(strng: String): String {

        val delimiter = "\n"
        val centerDivision = strng.split(delimiter).count() / 2

        val firstNewLineIndex = strng.indexOf(delimiter)
        val centerNewLineIndex =  strng.indexOf(delimiter, firstNewLineIndex + centerDivision -1)

        val firstHalf = strng.substring(0,centerNewLineIndex)
        val secondHalf = strng.substring(centerNewLineIndex)

        val secondHalfReversed = secondHalf.split(delimiter).reversed().joinToString(delimiter)
        val firstHalfReversed = firstHalf.split(delimiter).reversed().joinToString(delimiter)

        return secondHalfReversed + firstHalfReversed
    }

    fun oper(fct: (String) -> String, s: String): String {
        return fct(s)
    }
}