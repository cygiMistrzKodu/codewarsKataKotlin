fun isTuringEquation(s: String): Boolean {

    val numbersList =
        "(\\d+)\\+(\\d+)=(\\d+)".toRegex().find(s)?.groupValues?.subList(1, 4)?.map { it.reversed().toDouble() }

    if (numbersList != null) {
        return numbersList[0] + numbersList[1] == numbersList[2]
    }

    return false
}