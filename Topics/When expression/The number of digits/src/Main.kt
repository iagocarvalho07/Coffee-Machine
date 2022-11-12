fun main() {
    // put your code here
    var n = readln().toInt()

    print(when{
        n in 1..9 -> "1"
        n in 10..99 -> "2"
        n in 100..999 -> "3"
        n in 1000..9999 -> "4"
        else -> {
            "fora do intervalo"
        }
    })
}