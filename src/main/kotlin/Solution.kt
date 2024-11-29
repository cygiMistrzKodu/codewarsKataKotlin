package kprimes

import kotlin.math.sqrt

fun countKprimes(k: Int, start: Long, end: Long): LongArray {

    val foundedKprimes = mutableListOf<Long>()
    for (number in start..end) {
        if (isKPrimeMultiFactorAllow(number, k)) {
            foundedKprimes.add(number)
        }
    }

    return foundedKprimes.toLongArray()
}

fun puzzle(s: Int): Int {

    val onePrimes = countKprimes(1, 0, s.toLong())
    val threePrimes = countKprimes(3, 0, s.toLong())
    val sevenPrimes = countKprimes(7, 0, s.toLong())

    var solutions = 0

    onePrimes.forEach { onePrime ->
        threePrimes.forEach { threePrime ->
            sevenPrimes.forEach { sevenPrime ->
                if (onePrime + threePrime + sevenPrime == s.toLong()) {
                    solutions++
                }
            }
        }
    }

    return solutions
}

fun isKPrimeMultiFactorAllow(number: Long, kPrime: Int): Boolean {

    var n = number
    val primeFactors = mutableListOf<Long>()
    for (i in 2..sqrt(n.toDouble()).toLong()) {
        while (n % i == 0L) {
            primeFactors.add(i)
            n /= i
        }
    }

    if (n > 1) {
        primeFactors.add(n)
    }

    return primeFactors.size == kPrime
}
