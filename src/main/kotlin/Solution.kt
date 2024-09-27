fun filterList(l: List<Any>): List<Int> {

    return l.asSequence().filterIsInstance<Int>().toList()

}