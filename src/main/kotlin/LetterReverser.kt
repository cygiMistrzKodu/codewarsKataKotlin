fun findScreenHeight(width: Int, ratio: String): String {

    val splitRatio = ratio.split(":")

    val widthByFirstPartAspect = width / splitRatio[0].toFloat()
    val height = widthByFirstPartAspect * splitRatio[1].toInt()

    return "${width}x${height.toInt()}"
}