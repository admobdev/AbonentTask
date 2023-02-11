@file:Suppress("SpellCheckingInspection")

package BooleanAnswers

fun main() {
    println("1 - son kiritilsin: ")
    val num1 = readln().toInt()
    println("2 - son kiritilsin: ")
    val num2 = readln().toInt()
    println("3 - son kiritilsin: ")
    val num3 = readln().toInt()

    println("Jumlaga ko'ra natija : ${num2 in num1..num3} bo'ladi")
}