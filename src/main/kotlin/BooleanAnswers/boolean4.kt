@file:Suppress("SpellCheckingInspection")

package BooleanAnswers

fun main() {
    println("Son kiritilsin: ")
    val num = readln().toInt()

    when {
        num % 2 == 0 -> println("Juft son !")
        num % 2 == 1 -> println("Toq son !")
    }
}