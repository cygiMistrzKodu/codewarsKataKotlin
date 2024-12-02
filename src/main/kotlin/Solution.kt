package altcaps

fun capitalize(text: String): List<String> {

    val evenCapitalization = makeUppercaseLetters(text) { a -> a % 2 == 0 }
    val oddCapitalization = makeUppercaseLetters(text) { a -> a % 2 == 1 }

    return listOf(evenCapitalization, oddCapitalization)
}

fun makeUppercaseLetters(text: String, isLetterIndexToCapitalize: (Int) -> Boolean): String {

    val capitalization = mutableListOf<String>()

    for ((index, _) in text.withIndex()) {

        if (isLetterIndexToCapitalize(index)) {
            capitalization.add(text[index].uppercase())
        } else {
            capitalization.add(text[index].toString())
        }

    }

    return capitalization.joinToString("")
}
