fun wave(str: String): List<String> {

    if (str.isEmpty()) {
        return emptyList()
    }

    val mexicanWave = mutableListOf<String>()

    if (str.count() <= 1) {
        mexicanWave.add(str.uppercase())
        return mexicanWave
    }


    for ((index, _) in str.withIndex()) {

        if (str[index].isLetter()) {
            mexicanWave.add(str.substring(0, index) + str[index].uppercase() + str.substring(index + 1))
        }

    }
    return mexicanWave
}