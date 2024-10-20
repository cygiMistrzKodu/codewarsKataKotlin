package thirteen

fun thirt(n: Long): Long {

    var previousDigitCycleSum = -20L
    var currentCycleDigitSum = sumProductsBy13DivisibilityCycle(n)

    while (previousDigitCycleSum != currentCycleDigitSum) {
        previousDigitCycleSum = currentCycleDigitSum
        currentCycleDigitSum = sumProductsBy13DivisibilityCycle(currentCycleDigitSum)
    }

    return currentCycleDigitSum
}


fun sumProductsBy13DivisibilityCycle(number: Long): Long {

    var sumOfCycle = 0L;
    number.toString().reversed().toList().map { it.toString().toInt() }.forEachIndexed { index, digit ->
        sumOfCycle += getRemindersOf13ByDigitOrder(index) * digit
    }

    return sumOfCycle
}

fun getRemindersOf13ByDigitOrder(digitOrder: Int): Int {

    val remindersOfModulo13 = mapOf(
        0 to 1, 1 to 10, 2 to 9, 3 to 12, 4 to 3, 5 to 4
    )
    val chooseReminder = digitOrder % 6

    return remindersOfModulo13.getOrDefault(chooseReminder, 0)
}
