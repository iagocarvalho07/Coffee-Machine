enum class DangerLevel(val nivel: Int) {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    fun nivel(){
        println(HIGH.nivel)
    }
}