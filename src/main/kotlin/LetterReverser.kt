fun reverseLetter(str: String): String {

    return str.filter { a -> a.isLetter() }.reversed()
}