import kotlin.math.pow

fun digPow(n: Int, p: Int): Int {

    val digits = splitOnDigits(n)

    val sumRiseToToConsecutivePowers = riseToConsecutivePowers(digits, p).sum()

    var kCandidate = 0
    var kMultiplyN = 0
    var k = -1
    while (sumRiseToToConsecutivePowers >= kMultiplyN) {
        kMultiplyN = n * kCandidate

        if (kMultiplyN == sumRiseToToConsecutivePowers) {
            k = kCandidate
        }

        kCandidate++
    }
    return k
}

fun splitOnDigits(n: Int): List<Int> {

    val digits = mutableListOf<Int>()

    var number = n
    while (number > 0) {
        digits.add(number % 10)
        number /= 10
    }
    digits.reverse()

    return digits
}

fun riseToConsecutivePowers(digits: List<Int>, startPower: Int): List<Int> {

    val consecutivePowers = makePowersAsManyAsDigits(startPower, digits.count())

    return digits.asSequence().zip(consecutivePowers.asSequence()) { digit, power ->
        digit.toDouble().pow(power.toDouble())
    }.map { it.toInt() }.toList()


}

fun makePowersAsManyAsDigits(startPower: Int, count: Int): List<Int> {
    return List(count) { it + startPower }
}