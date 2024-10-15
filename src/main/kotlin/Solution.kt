object DNADecomposer {

    private var dnaStrand = ""
    private val dnaNucleotideStrandTransformation = mapOf("A" to "T", "G" to "C", "T" to "A", "C" to "G")

    fun setDnaStrand(dnaStrand: String) {
        this.dnaStrand = dnaStrand
    }

    fun decomposeDoubleStrand(doubleStrand: String): String {
        dnaStrand = doubleStrand

        return "${createFirstFrame()}\n${createSecondFrame()}\n${createThirdFrame()}\n\n${createFirstReversedFrame()}" +
                "\n${createSecondReversedFrame()}\n${createThirdReversedFrame()}"

    }

    fun createFirstFrame(): String {
        val title = "Frame 1: "
        return title + transformDNA(0, 0, 3)
    }

    fun createSecondFrame(): String {
        val title = "Frame 2: "
        return title + transformDNA(1, 1, 3)
    }

    fun createThirdFrame(): String {
        val title = "Frame 3: "
        return title + transformDNA(2, 2, 3)
    }

    private fun transformDNA(takeSignFromStart: Int, leaveFromStart: Int, sizeGroup: Int): String {

        val space = if (takeSignFromStart > 0) " " else ""
        return dnaStrand.take(takeSignFromStart) + space + dnaStrand.drop(
            leaveFromStart
        ).chunked(sizeGroup).joinToString(" ")
    }

    fun createFirstReversedFrame(): String {
        val firstFrame = transformDNA(0, 0, 3)

        val firstReversedFrame =
            firstFrame.asSequence().map { dnaNucleotideStrandTransformation.getOrDefault(it.toString(), " ") }
                .toList().joinToString("").reversed()

        return "Reverse Frame 1: $firstReversedFrame"
    }

    fun createThirdReversedFrame(): String {
        val secondFrame = transformDNA(1, 1, 3)

        val reversedFrameThird =
            secondFrame.asSequence().map { dnaNucleotideStrandTransformation.getOrDefault(it.toString(), " ") }
                .toList().joinToString("").reversed()

        return "Reverse Frame 3: $reversedFrameThird"

    }

    fun createSecondReversedFrame(): String {

        val thirdFrame = transformDNA(2, 2, 3)

        val reversedFrameSecond =
            thirdFrame.asSequence().map { dnaNucleotideStrandTransformation.getOrDefault(it.toString(), " ") }
                .toList().joinToString("").reversed()

        return "Reverse Frame 2: $reversedFrameSecond"
    }


}