package allinclusive

fun containAllRots(strng: String, arr: ArrayList<String>): Boolean {

    if (strng == "") {
        return true
    }

    var tmp = strng
    strng.forEach {
        val nextRotationString = tmp.replaceFirst(it.toString(), "") + it.toString()
        tmp = nextRotationString

        println(nextRotationString)

        if (!arr.contains(nextRotationString)) {
            println(nextRotationString)
            return false
        }

    }

    return true
}