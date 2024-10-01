package target

import java.time.LocalDate;

fun dateNbDays(a0: Double, a: Double, p: Double): String {

    val percentPerDay = p / 36000
    var money = a0
    var days = 0;

    while (money < a) {
        days++
        money += percentPerDay * money
    }

    val depositDate = LocalDate.of(2016, 1, 1)
    depositDate.plusDays(days.toLong())

    return "${depositDate.plusDays(days.toLong())}"
}