import java.util.*

object FixStringCase {

    fun solve(s: String): String {

        val lowerCaseLetterCount = s.count { it.isLowerCase() }
        val upperCaseLetterCount = s.count { it.isUpperCase() }

        if (lowerCaseLetterCount == upperCaseLetterCount) {
            return s.lowercase()
        }

        if (lowerCaseLetterCount > upperCaseLetterCount) {
            return s.lowercase()

        }

        return s.uppercase()
    }

}