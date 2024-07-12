package fizzBuzzCuckooClock

import kotlin.math.abs

fun fizzBuzzCuckooClock(time: String): String {

    val (hour, minute) = time.split(":").map { it.toInt() }.toTypedArray()

    var combination = ""
    if (minute % 3 == 0) {
        combination += "Fizz"
    }

    if (minute % 5 == 0) {
        if (combination.isEmpty()) {
            combination += "Buzz"
        } else {
            combination += " Buzz"
        }
    }

    if (minute % 3 != 0 && minute % 5 != 0) {
        combination = "tick"
    }

    if (minute == 30) {
        combination = "Cuckoo"
    }

    if (minute == 0) {
        if (hour <= 12) {
            combination = "Cuckoo ".repeat(hour).trim()
        }
        if (hour > 12 || hour == 0) {
            combination = "Cuckoo ".repeat(abs(hour - 12)).trim()
        }

    }

    return combination
}
