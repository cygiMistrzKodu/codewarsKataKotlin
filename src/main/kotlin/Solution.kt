fun mirror(text: String): String {

    val wordsReversed = text.split(" ").map { it.reversed() }.toList()
    val longestWordCount = wordsReversed.map { it.count() }.max()

    val verticalEdgesInARowCount = 4
    val horizontalEdgeStarCount = longestWordCount + verticalEdgesInARowCount

    val star = "*"
    val horizontalEdge = star.repeat(horizontalEdgeStarCount)

    val mirrorFrame = StringBuilder()
    mirrorFrame.append(horizontalEdge)

    val emptyRow = "\n"
    mirrorFrame.append(emptyRow)

    val leftEdge = "$star "
    val rightEdge = " $star"

    wordsReversed.forEach { word ->
        mirrorFrame.append(leftEdge)
        mirrorFrame.append(word)
        mirrorFrame.append(" ".repeat(longestWordCount - word.count()))
        mirrorFrame.append(rightEdge)
        mirrorFrame.append(emptyRow)

    }
    mirrorFrame.append(horizontalEdge)

    return mirrorFrame.toString()
}