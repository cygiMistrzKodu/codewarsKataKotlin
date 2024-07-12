fun f(n: Int): Int {

    if (n == 0) {
        return 1
    }
    return n - m(f(n - 1))
}

fun m(n: Int): Int {

    if (n == 0) {
        return 0
    }
    return n - f(m(n - 1))
}