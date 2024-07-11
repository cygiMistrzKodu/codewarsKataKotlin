fun geometricSequenceElements(a: Int, r: Int, n: Int): String {

    var sequenceString = ""
    var nextNumber = a
    for (number in 0..n - 2) {
        sequenceString += "$nextNumber, "
        nextNumber *= r
    }

    return sequenceString + nextNumber
}