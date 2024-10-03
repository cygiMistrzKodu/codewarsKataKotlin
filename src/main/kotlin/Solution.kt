package valley

fun makeValley(arr: IntArray): IntArray {

    val fromUpToBottom = arr.asSequence().sortedByDescending { it }.toList()

    val leftWing = mutableListOf<Int>()
    val rightWing =mutableListOf<Int>()

    fromUpToBottom.mapIndexed {index , value ->
        if (index % 2 == 0) {
            rightWing.add(value)
        } else {
            leftWing.add(0,value)
        }
    }

    return listOf(rightWing,leftWing).flatten().toIntArray()
}