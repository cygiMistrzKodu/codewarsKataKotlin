package going

import kotlin.math.ceil
import kotlin.math.pow

fun movie(card:Int, ticket:Int, perc:Double):Int {

    var systemA: Int
    var systemB: Double
    var sumOfTicketWithDiscount  = 0.0

    var day = 0

    do {

        day++

        systemA = ticket * day
        sumOfTicketWithDiscount += ticket * perc.pow(day.toDouble())
        systemB = card + sumOfTicketWithDiscount

    } while ( ceil(systemB) >= systemA)

    return day;
}