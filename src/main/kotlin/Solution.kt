package solution

import java.math.BigInteger

object Diagonal {

    fun diagonal(n: Int, p: Int): BigInteger {

        var r = BigInteger.valueOf(1L)
        var i = BigInteger.valueOf(1L)
        while (i <= BigInteger.valueOf((p + 1).toLong())) {
            r = r * (BigInteger.valueOf(n.toLong()) - i + BigInteger.valueOf(2L)) / i
            i = i + BigInteger.valueOf(1L)
        }
        return r
    }

}
