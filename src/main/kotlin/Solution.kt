package solution

import java.util.Locale
import kotlin.math.abs
import kotlin.math.round

object PiApprox {
    fun iterPi2String(epsilon: Double): String {

        var iteration = 0.0
        var piApproximation = 0.0

        while (abs(piApproximation - Math.PI) >= epsilon) {
            piApproximation += 4 * Math.pow(-1.0, iteration) / (2 * iteration + 1)
            iteration++
        }

        return "[${iteration.toInt()}, ${String.format(Locale.US, "%.10f", piApproximation)}]"
    }

}