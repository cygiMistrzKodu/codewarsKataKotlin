package codewars.cityhacker

import java.util.Locale

fun londonCityHacker(journey: Array<Any>): String {

    var cost = 0.0
    var bussAdjacent = 0
    for (connection in journey) {
        when (connection) {
            is String -> {
                cost += 2.4
                bussAdjacent = 0
            }

            is Number -> {
                if (bussAdjacent == 0) {
                    cost += 1.5
                }
                bussAdjacent++
                if (bussAdjacent >= 2) {
                    bussAdjacent = 0
                }
            }
        }
    }

    return "£${String.format(Locale.US, "%.2f", cost)}"
}