package approxfloat

import kotlin.math.floor

fun interp(f: (Double) -> Double, l: Double, u: Double, n: Int): List<Double> {

    return generateSequence(0) { it + 1 }
        .takeWhile { it < n }
        .map {
            (l + it) * (u - l) / n
        }
        .map { f.invoke(it) }
        .map { floor(it * 100.0) / 100.0 }
        .toList()
}