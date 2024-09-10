package updown

fun arrange(strng: String): String {

    val words = strng.split(" ").toMutableList()

    for (index in words.indices) {

        if (index < words.size - 1) {
            if (isOrderEven(index) && isNextWordShorter(words, index)) {
                moveWordOneStepLeft(words, index)
            }
            if (isOrderOdd(index) && isNextWordLonger(words, index)) {
                moveWordOneStepRight(words, index)
            }
        }
    }

    return makeDownAndUp(words).joinToString(" ")
}

private fun makeDownAndUp(words: MutableList<String>) = words.mapIndexed { index, word ->

    if (isOrderOdd(index)) {
        word.uppercase()
    } else {
        word.lowercase()
    }
}

private fun isOrderEven(index: Int) = index % 2 == 0

private fun isNextWordShorter(words: MutableList<String>, index: Int) =
    words[index].length > words[index + 1].length

private fun moveWordOneStepRight(words: MutableList<String>, index: Int) {
    swapPlaces(words, index)
}

private fun isOrderOdd(index: Int) = index % 2 == 1

private fun isNextWordLonger(words: MutableList<String>, index: Int) =
    words[index].length < words[index + 1].length

private fun moveWordOneStepLeft(words: MutableList<String>, index: Int) {
    swapPlaces(words, index)
}

private fun swapPlaces(words: MutableList<String>, index: Int) {
    val word = words[index]
    words[index] = words[index + 1]
    words[index + 1] = word
}
