package solution

object Opstrings {

    fun vertMirror(strng: String): String {
        return strng.split("\n").joinToString("\n") { it.reversed() }
    }

    fun horMirror(strng: String): String {
        return strng.split("\n").reversed().joinToString("\n")
    }

    fun oper(fct: (String) -> String, s: String): String {
        return fct(s)
    }
}