package solution

import java.math.BigInteger

object Diagonal {

    fun diagonal(n: Int, p: Int): BigInteger {

        var res = BigInteger.ONE
        var start = (n - p + 1).toBigInteger()
        var row = BigInteger.ONE

        for (i in 0..p) {
            res = res * start / row
            start++
            row++
        }
        return res



    }

}
