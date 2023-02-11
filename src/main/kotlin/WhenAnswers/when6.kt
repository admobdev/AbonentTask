@file:Suppress("SpellCheckingInspection")

package WhenAnswers


fun main() {

    println("Birinchi son kiritilsin: ")
    val num1 = readln().toInt()
    println("Ushu amallardan biri kiritilsin: ( + , - , * , / )")
    val operator = readln()
    println("Ikkinchi son kiritilsin: ")
    val num2 = readln().toInt()

    when(operator){
        "+" -> println("Natija: $num1 + $num2 = ${num1 + num2}")
        "-" -> println("Natija: $num1 - $num2 = ${num1 - num2}")
        "*" -> println("Natija: $num1 * $num2 = ${num1 * num2}")
        "/" -> println("Natija: $num1 / $num2 = ${num1 / num2}")
        else -> println("Noto'g'ri operator tanladingiz !!")
    }
}