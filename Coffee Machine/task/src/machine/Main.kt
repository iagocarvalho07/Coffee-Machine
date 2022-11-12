package machine

var water = 400
var milk = 540
var coffeeBeans = 120
var cpus = 9
var money = 550
fun main (){
    escolha()

}
fun machineHas(){

    println(""""the coffee machine has
        |${water} ml of water
        |${milk} ml of milk
        |${coffeeBeans} G of coffee beans
        |${cpus} dis´psabçe cups
        |$${money} of money
    """.trimMargin())
}

fun escolha (){
    println("Write action (buy, fill, take, remaining, exit):")
    val buyFillTake = readLine().toString().toLowerCase()
    if (buyFillTake == "buy"){
        return buy()
    }else if (buyFillTake == "take"){
        return take()
    }else if (buyFillTake == "fill"){
        return fill()
    }else if(buyFillTake =="remaining"){
        return remaining()
    }else if (buyFillTake == "exit"){
        return exit()
    } else {
        println("I didn't understand your answer, can you repeat it please?")
    return escolha()
    }
}


fun buy (){
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: back - to main menu:")
    val option = readln().toString()
    when (option){
        "back" -> {
            return escolha()
    }
        "1" -> { if(water >= 250 && coffeeBeans >= 16 && cpus >= 1){
        println("I have enough resources, making you a coffee!")
        water -= 250
        coffeeBeans -= 16
        money += 4
        cpus -=1
    } else{
        if (water < 250){
            println("Sorry, not enough water!")
        }
        if (coffeeBeans <16){
            println("Sorry, not enough Coffee beans!")
        }
        if (cpus < 1){
            println("Sorry, not enough cups!")
        }
    }

    }
        "2" -> { if(water >= 250 && coffeeBeans >= 16 && cpus >= 1){
        println("I have enough resources, making you a coffee!")
        water -= 350
        milk -= 75
        coffeeBeans -= 20
        money += 7
        cpus -=1
    }else {
        if (water < 350) {
            println("Sorry, not enough water!")
        }
        if (coffeeBeans < 20) {
            println("Sorry, not enough Coffee beans!")
        }
        if (cpus < 1) {
            println("Sorry, not enough cups!")
        }
        if(milk < 75){
            println("Sorry, not enough milk!")
        }
    }

    }
        "3" -> {if(water >= 250 && coffeeBeans >= 16 && cpus >= 1){
        println("I have enough resources, making you a coffee!")
        water -= 200
        milk -= 100
        coffeeBeans -= 12
        money += 6
        cpus -=1
    }else{
        if (water < 200) {
            println("Sorry, not enough water!")
        }
        if (coffeeBeans < 12) {
            println("Sorry, not enough Coffee beans!")
        }
        if (cpus < 1) {
            println("Sorry, not enough cups!")
        }
        if(milk < 100){
            println("Sorry, not enough milk!")
        }

    }
    }
        else -> {
        println("I didn't understand your answer, can you repeat it please?")
        return buy()
    }
    }
    escolha()

}

fun fill(){
    println("Write how many ml of water you want to add: ")
    val addWater = readLine()?.toInt()
    println("Write how many ml of milk you want to add:")
    val addMilk =  readLine()?.toInt()
    println("Write how many grams of coffee beans you want to add:")
    val addCoffeBeans =  readLine()?.toInt()
    println("Write how many disposable cups you want to add:")
    val addCups =  readLine()?.toInt()

    if (addWater != null) water += addWater
    if (addMilk != null) milk += addMilk
    if (addCoffeBeans != null) coffeeBeans += addCoffeBeans
    if (addCups != null) cpus += addCups

    escolha()



}

fun take(){
    println("I gave ou $money")
    money = 0

    escolha()
}

fun remaining(){
    machineHas()
    escolha()
}

fun exit(){

}














































//var i = 0
//fun main() {
//    println("Write how many ml of water the coffee machine has: ")
//    var water = readLine()!!.toInt()
//    println("Write how many ml of milk the coffee machine has: ")
//    var milk = readLine()!!.toInt()
//    println("Write how many grams of coffee beans the coffee machine has: ")
//    var coffee = readLine()!!.toInt()
//    println("Write how many cups of coffee you will need: ")
//    val cups = readLine()!!.toInt()
//    while (water >= 200 && milk >= 50 && coffee >= 15) {
//        water -= 200
//        milk -= 50
//        coffee -= 15
//        i++
//    }
//    if (i == cups) {
//        println("Yes, I can make that amount of coffee")
//    } else if (i < cups) {
//        println("No, I can make only $i cups of coffee")
//    } else if (i > cups) {
//        println("Yes, I can make that amount of coffee (and even ${i - cups} more than that)")
//    }
//}
//
//
//fun buy(){
//
//}
//
//fun fill(){
//
//}
//
//fun take(){
//
//}