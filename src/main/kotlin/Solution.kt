package solution

import java.math.BigInteger

object Diagonal {

    fun diagonal(n: Int, p: Int): BigInteger {

        var result = BigInteger.ONE
        for (i in 0L..p.toLong()) {
            result *= BigInteger.valueOf(n - i + 1)
            result /= BigInteger.valueOf(i + 1)
        }
        return result
    }

}
