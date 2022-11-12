fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    if (timer.time < -128) {
        timer.time = -128
        println(timer.time)
    } else if (timer.time > 127) {
        timer.time = 127
        println(timer.time)
    } else {
        println(timer.time)
    }

}

data class ByteTimer(var time: Int) {
}