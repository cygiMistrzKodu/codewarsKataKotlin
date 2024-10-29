object Solution {

    private val alphabetValueMap: Map<Char, Int>

    init {
        val alphabet = ('a'..'z').toList()
        alphabetValueMap = alphabet.mapIndexed { index, char -> char to index + 1 }.toMap()
    }

    fun nameValue(arr: Array<String>): IntArray {

        return arr.mapIndexed { index, word ->

            (index + 1) * valueFromWord(word)

        }.toIntArray()

    }

    private fun valueFromWord(word: String): Int {

        return word.map { char -> alphabetValueMap.getOrDefault(char, 0) }.sum()
    }

}