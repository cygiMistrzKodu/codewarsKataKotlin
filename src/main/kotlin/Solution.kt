fun babyCount(x: String): Int? {

    val babyLetters = listOf('a', 'b', 'y')

    val babyLetterCountMap = x.map { it.lowercaseChar() }.filter { babyLetters.contains(it) }.groupBy { it }
        .mapValues { (_, value) -> value.size }

    var letterACount = babyLetterCountMap['a'] ?: 0
    var letterBCount = babyLetterCountMap['b'] ?: 0
    var letterYCount = babyLetterCountMap['y'] ?: 0

    var babiesCount = 0;
    while (letterBCount > 1 && letterACount > 0 && letterYCount > 0) {
        letterACount--
        letterBCount -= 2
        letterYCount--
        babiesCount++
    }

    return if (babiesCount == 0) null else babiesCount
}