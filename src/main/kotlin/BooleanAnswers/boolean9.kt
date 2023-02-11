@file:Suppress("SpellCheckingInspection")

package BooleanAnswers

fun main() {
    println("1 - son kiritilsin: ")
    val num1 = readln().toInt()
    println("2 - son kiritilsin: ")
    val num2 = readln().toInt()

    when {
        num1 % 2 == 1 && num2 % 2 == 1 -> println("Kiritilgan ikkala son ham toq !!")
        else -> println("Sonlar ichida jufti bor")
    }
}