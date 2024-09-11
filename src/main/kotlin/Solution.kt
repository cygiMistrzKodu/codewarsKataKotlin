package solution

import kotlin.math.pow

object Cubes {
    fun isSumOfCubes(s: String): String {

        val regex = "\\d{3}|\\d{2}|\\d".toRegex()

        val numbers = regex.findAll(s)
            .map { it.value.toInt() }
            .toList()


        val cubicNumbers: MutableList<Int> = mutableListOf()
        numbers.forEach { number ->
            val cubicDigitsSum = number.toString().map { it.toString().toInt().toDouble().pow(3).toInt() }.sum()

            if (cubicDigitsSum == number) {
                cubicNumbers.add(number)
            }

        }

        return if (cubicNumbers.isEmpty()) {
            "Unlucky"
        } else {
            cubicNumbers.joinToString(" ") + " ${cubicNumbers.sum()} Lucky"
        }

    }
}



