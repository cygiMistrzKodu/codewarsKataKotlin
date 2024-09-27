fun alphabetWar(fight: String): String {

    val leftPower = mapOf(
        "w" to 4,
        "p" to 3,
        "b" to 2,
        "s" to 1
    )

    val rightPower = mapOf(
        "m" to 4,
        "q" to 3,
        "d" to 2,
        "z" to 1

    )

    val leftScore = calculateScore(fight, leftPower)
    val rightScore = calculateScore(fight, rightPower)

    if (leftScore > rightScore) {
        return "Left side wins!"
    }

    if (leftScore < rightScore) {
        return "Right side wins!"
    }

    return "Let's fight again!"

}

private fun calculateScore(fight: String, powers: Map<String, Int>) =
    fight.split("").filter { powers.containsKey(it) }.mapNotNull { powers[it] }
        .fold(0) { sum, power -> sum + power }