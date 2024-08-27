package solution

object BuyCar {
    fun nbMonths(
        startPriceOld: Int,
        startPriceNew: Int,
        savingperMonth: Int,
        percentLossByMonth: Double
    ): Pair<Int, Int> {

        var oldCarWorth = startPriceOld.toDouble()
        var newCarWorth = startPriceNew.toDouble()
        var cumulativeLossPerMonthPercent = percentLossByMonth
        var totalSavingPerMonth = 0

        var cashDifference = oldCarWorth - newCarWorth
        var months = 0

        while (cashDifference < 0) {
            months++
            totalSavingPerMonth += savingperMonth

            if (months % 2 == 0) {
                cumulativeLossPerMonthPercent += 0.5
            }

            oldCarWorth = (oldCarWorth * (100 - cumulativeLossPerMonthPercent) / 100)
            newCarWorth = newCarWorth * (100 - cumulativeLossPerMonthPercent) / 100

            cashDifference = (oldCarWorth - newCarWorth) + totalSavingPerMonth


        }
        return Pair(months, Math.round(cashDifference).toInt())
    }
}