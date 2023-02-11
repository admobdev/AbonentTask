@file:Suppress("SpellCheckingInspection")

package BooleanAnswers

fun main() {
    println("1 - son kiritilsin: ")
    val num1 = readln().toInt()
    println("2 - son kiritilsin: ")
    val num2 = readln().toInt()
    println("3 - son kiritlsin: ")
    val num3 = readln().toInt()

    val positiveCount = listOf(num1, num2, num3).count { it > 0 }
    println("Jumlaga ko'ra natija: ${positiveCount == 2} bo'ladi")}