package solution

object ModSystem {

    fun fromNb2Str(n: Int, sys: IntArray): String {

        val product = sys.reduce { product, number -> product * number }
        if (product <= n) {
            return "Not applicable"
        }

        if (!areAllCoprime(sys)) {
            return "Not applicable"
        }

        return "-${sys.map { n % it }.joinToString("--") { "$it" }}-"
    }


    fun areAllCoprime(numbers: IntArray): Boolean {
        for (i in numbers.indices) {
            for (j in i + 1 until numbers.size) {
                if (gratesCommonDenominator(numbers[i], numbers[j]) != 1) {
                    return false
                }
            }
        }
        return true
    }

    fun gratesCommonDenominator(a: Int, b: Int): Int {
        return if (b == 0) a else gratesCommonDenominator(b, a % b)
    }
}