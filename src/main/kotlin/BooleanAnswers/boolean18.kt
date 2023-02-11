@file:Suppress("SpellCheckingInspection")

package BooleanAnswers

fun main() {
    println("3 xonali musbat son kiritilsin: ")
    val num = readln().toInt()

    println("Jumlaga ko'ra natija: ${num in 100..999 && num % 2 == 1}")
}