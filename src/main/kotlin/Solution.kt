package diophequa

fun solEquaStr(n: Long): String {

    return (1..Math.sqrt(n.toDouble()).toInt()).filter {
        (n % it).toInt() == 0 && (n / it - it).toInt() % 4 == 0
    }.map {
        listOf((n / it + it) / 2, (n / it - it) / 4)
    }.toString()
}




