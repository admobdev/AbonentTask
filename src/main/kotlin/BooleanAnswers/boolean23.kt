@file:Suppress("SpellCheckingInspection")

package BooleanAnswers

fun main() {
    println("3 xonali son kiritilsin: ")
    val num = readln().toInt()

    val ones = num % 10
    val tens = num % 100 / 10
    val hundreds = num / 100
    println("Jumlaga ko'ra natija: ${tens in (hundreds + 1) until ones || tens in (ones + 1) until hundreds}")
}