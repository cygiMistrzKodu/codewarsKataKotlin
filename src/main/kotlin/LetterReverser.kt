package hero

import kotlin.math.abs

fun intRac(n: Long, guess: Long): Long {

    var aproximation = guess
    val e = 1

    val approximations: MutableList<Long> = mutableListOf()
    approximations.add(guess)
    var index = 0

    do {

        aproximation = (aproximation + (n / aproximation)) / 2

        approximations.add(aproximation)

        index++

    } while (abs(approximations[index - 1] - approximations[index]) > e)

    if (approximations[index] == approximations[index - 1]) {
        return approximations.count().toLong() - 1
    }

    return approximations.count().toLong()
}