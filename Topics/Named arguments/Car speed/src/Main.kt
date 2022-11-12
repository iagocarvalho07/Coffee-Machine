fun main(args: Array<String>) {
    val speed = readln().toInt()
    val limit = readln()

    if (limit == "no limit") {
        checkLimit(speed)
    } else {
        checkLimit(speed, limit.toInt())
    }
}

fun checkLimit(speed: Int, limit: Int = 60) {
    print(
        if (speed > limit) {
            "Exceeds the limit by ${speed - limit} kilometers per hour"
        } else {
            "Within the limit"
        }
    )
}