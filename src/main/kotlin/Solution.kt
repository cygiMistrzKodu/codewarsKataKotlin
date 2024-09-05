package ball

fun maxBall(v0: Int): Int {

    var heightPrevious = 0.0
    var height = 1.0
    var maxHeightInTentOfTheSecond = 0

    val numbers = generateSequence(1) { it + 1 }

    numbers.takeWhile { height > heightPrevious }
        .forEach { number ->

            heightPrevious =
                calculateHeight(v0, calculateTenthOfSeconds(number - 1))

            height =
                calculateHeight(v0, calculateTenthOfSeconds(number))

            maxHeightInTentOfTheSecond = number - 1

        }

    return maxHeightInTentOfTheSecond
}

private fun calculateTenthOfSeconds(number: Int) = (number.toDouble() / 10)

private fun calculateHeight(speedInKmH: Int, tenthOfSecond: Double): Double {

    val gravity = 9.81
    val startSpeedInMs = speedInKmH / 3.6
    return ((startSpeedInMs * tenthOfSecond) - (0.5 * gravity * tenthOfSecond * tenthOfSecond))
}
