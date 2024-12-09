package diophequa

fun solEquaStr(n: Long): String {

    val factorsPairs = findFactors(n)

    val solutionsNonNegative = mutableListOf<Pair<Long, Long>>()
    for (pair in factorsPairs) {
        val sumPairs = pair.first + pair.second
        val x = sumPairs.toDouble() / 2

        if (isInteger(x)) {

            val y = (-pair.first + x) / 2

            if (isInteger(y)) {

                if (x >= 0 && y >= 0) {
                    solutionsNonNegative.add(Pair(x.toLong(), y.toLong()))
                }
            }

        }
    }

    return "${solutionsNonNegative.map { listOf(it.first, it.second) }}"
}

fun findFactors(number: Long): List<Pair<Long, Long>> {
    val factors = mutableListOf<Pair<Long, Long>>()
    for (i in 1L..number) {
        if (number % i == 0L) {
            val pair = Pair(i, number / i)
            factors.add(pair)
        }
    }
    return factors
}

fun isInteger(number: Double): Boolean {
    return number % 1.0 == 0.0
}




