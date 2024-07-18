fun beggars(values: List<Int>, n: Int): List<Int> {

    val beggarsSum = MutableList(n) { 0 }

    if (beggarsSum.isEmpty()) {
        return emptyList()
    }

    var beggarIndex = 0
    values.forEach {

        if (beggarIndex >= beggarsSum.count()) {
            beggarIndex = 0
        }

        beggarsSum[beggarIndex] += it
        beggarIndex++

    }

    return beggarsSum
}