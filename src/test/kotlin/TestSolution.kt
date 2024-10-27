package solution

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class OrdersSummaryTest {

    private fun testing(lst: String, expect: String) {
        val actual: String = OrdersSummary.balanceStatements(lst)
        assertEquals(expect, actual)
    }

    @Test
    fun basicTests() {
        var l = "GOOG 300 542.0 B, AAPL 50 145.0 B, CSCO 250.0 29 B, GOOG 200 580.0 S"
        var sol = "Buy: 169850 Sell: 116000; Badly formed 1: CSCO 250.0 29 B ;"
        testing(l, sol)
        l = "GOOG 90 160.45 B, JPMC 67 12.8 S, MYSPACE 24.0 210 B, CITI 50 450 B, CSCO 100 55.5 S"
        sol = "Buy: 14440 Sell: 6408; Badly formed 2: MYSPACE 24.0 210 B ;CITI 50 450 B ;"
        testing(l, sol)
        l = "ZNGA 1300 2.66 B, CLH15.NYM 50 56.32 B, OWW 1000 11.623 B, OGG 20 580.1 B"
        sol = "Buy: 29499 Sell: 0"
        testing(l, sol)

        l = ""
        sol = "Buy: 0 Sell: 0"
        testing(l, sol)

    }

    @Test
    fun foundBadlyFormattedOrderTest() {
        var clientOrder = "GOOG 300 542.0 B, AAPL 50 145.0 B, CSCO 250.0 29 B, GOOG 200 580.0 S"
        var badFormatedString = listOf("CSCO 250.0 29 B")
        assertEquals(badFormatedString, OrdersSummary.findWrongFormattedOrders(clientOrder))

        clientOrder = "GOOG 90 160.45 B, JPMC 67 12.8 S, MYSPACE 24.0 210 B, CITI 50 450 B, CSCO 100 55.5 S"
        badFormatedString = listOf("MYSPACE 24.0 210 B", "CITI 50 450 B")
        assertEquals(badFormatedString, OrdersSummary.findWrongFormattedOrders(clientOrder))

        clientOrder = "ZNGA 1300 2.66 B, CLH15.NYM 50 56.32 B, OWW 1000 11.623 B, OGG 20 580.1 B"
        badFormatedString = listOf()
        assertEquals(badFormatedString, OrdersSummary.findWrongFormattedOrders(clientOrder))
    }

    @Test
    fun chooseRightOrderTest() {

        var clientOrder = "GOOG 300 542.0 B, AAPL 50 145.0 B, CSCO 250.0 29 B, GOOG 200 580.0 S"
        var rightFormattedOrders = listOf("GOOG 300 542.0 B", "AAPL 50 145.0 B", "GOOG 200 580.0 S")
        assertEquals(rightFormattedOrders, OrdersSummary.chooseRightOrders(clientOrder))

        clientOrder = "GOOG 90 160.45 B, JPMC 67 12.8 S, MYSPACE 24.0 210 B, CITI 50 450 B, CSCO 100 55.5 S"
        rightFormattedOrders = listOf("GOOG 90 160.45 B", "JPMC 67 12.8 S", "CSCO 100 55.5 S")
        assertEquals(rightFormattedOrders, OrdersSummary.chooseRightOrders(clientOrder))

    }

    @Test
    fun buyAndSellTest() {
        var clientOrders = "GOOG 300 542.0 B, AAPL 50 145.0 B, CSCO 250.0 29 B, GOOG 200 580.0 S"
        var buyAndSellResult = "Buy: 169850 Sell: 116000"
        assertEquals(buyAndSellResult, OrdersSummary.buyAndSellSummary(clientOrders))

        clientOrders = "ZNGA 1300 2.66 B, CLH15.NYM 50 56.32 B, OWW 1000 11.623 B, OGG 20 580.1 B"
        buyAndSellResult = "Buy: 29499 Sell: 0"
        assertEquals(buyAndSellResult, OrdersSummary.buyAndSellSummary(clientOrders))


        clientOrders = "GOOG 90 160.45 B, JPMC 67 12.8 S, MYSPACE 24.0 210 B, CITI 50 450 B, CSCO 100 55.5 S"
        buyAndSellResult = "Buy: 14440 Sell: 6408"
        assertEquals(buyAndSellResult, OrdersSummary.buyAndSellSummary(clientOrders))


    }


}