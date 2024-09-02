package solution

import java.time.Duration
import java.time.LocalTime

class Athlete(athleteTime: String) {
    private var hours: Int = 0
    private var minutes: Int = 0
    private var seconds: Int = 0
    private var time: LocalTime = LocalTime.MIDNIGHT

    init {
        val times = athleteTime.trim().split("|")

        hours = times[0].toInt()
        minutes = times[1].toInt()
        seconds = times[2].toInt()

        time = LocalTime.of(hours, minutes, seconds)
    }


    fun getTime(): LocalTime {
        return time
    }

    override fun toString(): String {
        return "Athlete(time=$time)"
    }


}

class AthleticStatistic(teamTimes: String) {

    private val athletesTimes: MutableList<Athlete> = mutableListOf()


    init {
        val teamTimesList = teamTimes.split(",")
        teamTimesList.forEach { athletesTimes.add(Athlete(it)) }
    }

    fun getRange(): LocalTime {


        val shortestTime = athletesTimes.minOfOrNull { it.getTime() }
        val longestTime = athletesTimes.maxOfOrNull { it.getTime() }

        val duration = Duration.between(shortestTime, longestTime)

        return LocalTime.MIDNIGHT.plus(duration)

    }

    fun getAverage(): LocalTime {

        val totalDurations = athletesTimes.map { it.getTime() }
            .map { Duration.between(LocalTime.MIDNIGHT, it) }
            .reduce { allDurations, duration -> allDurations.plus(duration) }

        val averageDuration = totalDurations.dividedBy(athletesTimes.size.toLong())

        return LocalTime.MIDNIGHT.plus(averageDuration)

    }

    fun getMedian(): LocalTime {

        val sortedTimes = athletesTimes.map { it.getTime() }.sorted()

        val median = if (sortedTimes.size % 2 == 1) {
            sortedTimes[sortedTimes.size / 2]
        } else {

            val timeMiddle1 = sortedTimes[sortedTimes.size / 2 - 1]
            val timeMiddle2 = sortedTimes[sortedTimes.size / 2]

            val averageDuration = Duration.between(LocalTime.MIDNIGHT, timeMiddle1)
                .plus(Duration.between(LocalTime.MIDNIGHT, timeMiddle2))
                .dividedBy(2)
            LocalTime.MIDNIGHT.plus(averageDuration)
        }

        return median
    }


}

object Stat {

    fun stat(s: String): String {

        if (s.isEmpty()) {
            return s
        }

        val athleticStatistic = AthleticStatistic(s)

        val rangeTime = athleticStatistic.getRange()
        val averageTime = athleticStatistic.getAverage()
        val medianTime = athleticStatistic.getMedian()


        val statisticString =
            "Range: ${formatWithPadding(rangeTime)} Average: ${formatWithPadding(averageTime)} Median: ${
                formatWithPadding(medianTime)
            }"


        return statisticString
    }

    private fun formatWithPadding(time: LocalTime): String {

        return time.hour.toString().padStart(2, '0') + "|" + time.minute.toString()
            .padStart(2, '0') + "|" + time.second.toString().padStart(2, '0')

    }
}