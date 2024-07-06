fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {

    val contentThreshold = (threshold / 100) * content
    var dayEvaporatorUseless = 0;
    var contentLostEachDay = content;
    val percentLost = evap_per_day / 100

    do {

        contentLostEachDay -= contentLostEachDay * percentLost
        dayEvaporatorUseless++

    } while (contentThreshold < contentLostEachDay)

    return dayEvaporatorUseless
}