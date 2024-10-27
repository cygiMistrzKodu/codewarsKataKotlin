package solution

import kotlin.math.roundToInt

object OrdersSummary {

    enum class OrderType(val transaction: Regex) {
        BUY("B\$".toRegex()), SELL("S\$".toRegex())
    }

    fun balanceStatements(lst: String): String {

        println(lst)

        val ordersWrongFormatted = findWrongFormattedOrders(lst)

        val buyAndSell = buyAndSellSummary(lst)

        return if (ordersWrongFormatted.isEmpty() || lst.isEmpty()) {
            buyAndSell
        } else {
            "${buyAndSell}; Badly formed ${ordersWrongFormatted.count()}: " +
                    "${ordersWrongFormatted.joinToString(" ;")} ;"
        }

    }

    fun findWrongFormattedOrders(clientOrders: String): List<String> {

        val badlyFormattedOrders = mutableListOf<String>()

        clientOrders.split(",").forEach { order ->

            if (!clientOrderPattern().containsMatchIn(order)) {
                badlyFormattedOrders.add(order.trim())
            }

        }

        return badlyFormattedOrders
    }

    fun chooseRightOrders(clientOrders: String): List<String> {

        val rightOrders = mutableListOf<String>()

        clientOrders.split(",").forEach { order ->

            if (clientOrderPattern().containsMatchIn(order)) {
                rightOrders.add(order.trim())
            }

        }
        return rightOrders
    }

    private fun clientOrderPattern(): Regex {
        return "[\\w.]* \\d+ \\d+\\.\\d+ B|[\\w.]* \\d+ \\d+\\.\\d+ S".toRegex()
    }

    fun buyAndSellSummary(clientOrder: String): String {

        val orders = chooseRightOrders(clientOrder)

        val buyOrdersSum = sumOrders(orders, OrderType.BUY)

        val sellOrdersSum = sumOrders(orders, OrderType.SELL)

        return "Buy: $buyOrdersSum Sell: $sellOrdersSum"
    }

    private fun sumOrders(orders: List<String>, orderType: OrderType): Int {
        val buyOrdersSum = orders.filter { it.contains(orderType.transaction) }.sumOf {
            quantityAndPriceRegex().findAll(it).sumOf { matchResult ->
                val (quantity, price) = matchResult.destructured
                quantity.toInt() * price.toDouble()
            }
        }.roundToInt()
        return buyOrdersSum
    }

    private fun quantityAndPriceRegex(): Regex {
        return """(\d+)\s*(\d+\.\d+)""".toRegex()
    }
}