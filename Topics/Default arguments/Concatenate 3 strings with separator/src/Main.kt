// complete this function
fun concatenate(str1: String, str2: String, str3: String, str4: String = ""): String {
    var a1 = "" 
    when (str4){
        "~~~" -> a1 = "$str1~~~$str2~~~$str3" 
        "" -> a1 ="$str1 $str2 $str3"} 
    return a1 } // fun main() { // println(concatenate("Hyperskill ", "Kotlin", "Programação", "~~~")) // }

