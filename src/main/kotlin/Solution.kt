package newavg

import kotlin.math.ceil
import kotlin.math.roundToLong

fun newAvg(a: DoubleArray, navg: Double): Long {

    val x = navg*(a.size + 1) - a.sum()
    require(x >= 0)
    return ceil(x).roundToLong()
}