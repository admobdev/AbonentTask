@file:Suppress("SpellCheckingInspection")

package beginAnswers

import kotlin.math.*


fun main() {

    println("1 - aylana radiusi kiritilsin: ")
    val a = readln().toInt()
    println("2 - aylana radiusi kiritilsin: ")
    val b = readln().toInt()

    println("1 - aylana yuzasi: ${PI * a}")
    println("2 - aylana yuzasi: ${PI * b}")
    println("Ularning ayirmasi: ${PI * (a - b)}")
}