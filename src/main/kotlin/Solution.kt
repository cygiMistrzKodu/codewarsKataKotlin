package besttravel

fun chooseBestSum(t: Int, k: Int, ls: List<Int>): Int {

    val townCombinations = mutableListOf<List<Int>>()

    fun generateCombinations(currentCombination: List<Int>, startIndex: Int) {

        if (currentCombination.size == k) {
            townCombinations.add(currentCombination.toList())
            return
        }

        for (i in startIndex until ls.size) {
            generateCombinations(currentCombination + ls[i], i + 1)
        }
    }

    generateCombinations(emptyList(), 0)

    var bestSum = -1

    townCombinations.forEach {

        val sumTownGroup = it.sum()

        if (sumTownGroup in (bestSum + 1)..t) {
            bestSum = sumTownGroup
        }
    }

    return bestSum
}