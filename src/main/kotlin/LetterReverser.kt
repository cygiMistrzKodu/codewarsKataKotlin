package countdig

fun countDigitInNumber(number: Int, digit: Int): Int {
    var temp = number
    var digitCount = 0
    while (temp != 0) {
        val nextDigit = temp % 10
        if (nextDigit == digit) {
            digitCount++
        }
        temp /= 10
    }
    return digitCount
}

fun nbDig(n: Int, d: Int): Int {

    var digitCount  = if (d == 0) 1 else 0
    for (number in 0..n) {
        digitCount += countDigitInNumber(number * number, d)
    }
    return digitCount


}

