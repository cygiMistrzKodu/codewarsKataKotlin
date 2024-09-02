package gps

import kotlin.math.floor

fun gps(s: Int, x: DoubleArray): Int {

    if (x.size <= 1) {
        return 0
    }

    val biggestDiff = x.asSequence().zipWithNext { a, b -> b - a }.max()

    return floor(3600 * biggestDiff / s).toInt()
}