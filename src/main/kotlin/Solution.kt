package newavg

fun newAvg(a: DoubleArray, navg: Double): Long {

    var average = if (a.isNotEmpty()) a.sum() / a.count() else 0.0

    if (average >= navg) {
        throw IllegalArgumentException()
    }

    var nextDonation = 0L
    val beforeDonationSum = a.sum()
    val nextDonationCount = a.count() + 1

    while (average < navg) {

        nextDonation++
        average = (beforeDonationSum + nextDonation) / nextDonationCount

    }

    return nextDonation
}