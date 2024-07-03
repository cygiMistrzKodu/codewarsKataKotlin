package catmouse

fun catMouse(s: String): String {

    val dotCount = s.count { c: Char -> c == '.' }

    return if (dotCount <= 3) "Caught!" else "Escaped!"
}