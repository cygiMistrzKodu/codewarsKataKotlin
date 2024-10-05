fun alphabetWar(fight: String): String {

    val letterPowers = mapOf(
        'w' to -4, 'p' to -3, 'b' to -2, 's' to -1,
        'm' to 4, 'q' to 3, 'd' to 2, 'z' to 1
    )

    val airStrikeRegex = "\\w\\*+\\w|\\w\\*|\\*\\w|\\*".toRegex()
    val lettersAfterStrike = fight.replace(airStrikeRegex, "")

    var warResult = 0
    lettersAfterStrike.forEach { letter ->
        warResult += letterPowers.getOrDefault(letter, 0)
    }

    if (warResult < 0) {
        return "Left side wins!"
    }

    if (warResult > 0) {
        return "Right side wins!"
    }

    return "Let's fight again!"
}