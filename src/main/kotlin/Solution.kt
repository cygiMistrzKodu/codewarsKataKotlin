package bouncing

fun bouncingBall(h: Double, bounce: Double, window: Double): Int {

    if (h <= 0 || window >= h || bounce <= 0 || bounce >= 1) {
        return -1
    }

    var timesBallSeen = 0;
    var ballHeight = h
    while (ballHeight > window) {
        timesBallSeen += 2
        ballHeight *= bounce
    }


    return timesBallSeen - 1
}