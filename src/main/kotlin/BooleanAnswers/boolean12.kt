@file:Suppress("SpellCheckingInspection")

package BooleanAnswers

fun main() {
    println("1 - son kiritilsin: ")
    val num1 = readln().toInt()
    println("2 - son kiritilsin: ")
    val num2 = readln().toInt()

    println("Jumlaga ko'ra natija: ${num1 % 2 == 1 && num2 % 2 == 1 || num1 % 2 == 0 && num2 % 2 == 0 } bo'ladi")
}