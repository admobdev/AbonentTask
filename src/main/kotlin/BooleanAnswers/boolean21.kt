@file:Suppress("SpellCheckingInspection")

package BooleanAnswers

fun main() {
    println("3 xonali son kiritilsin: ")
    val num = readln().toInt()


    println("Jumlaga ko'ra natija: ${num in 1..9 != num in 10..99 != num in 100..999}")
}