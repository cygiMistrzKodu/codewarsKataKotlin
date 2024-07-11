fun outed(meet: Map<String, Int>, boss: String): String {

    val sumNoBoss = meet.values.reduce { sum, happinessRating -> sum + happinessRating }
    val bossEntry = meet.entries.first { it.key == boss }
    val sumWithBoss = sumNoBoss + bossEntry.value
    val overallHappiness = sumWithBoss / meet.count()

    return if (overallHappiness <= 5) "Get Out Now!" else "Nice Work Champ!"
}