@file:Suppress("SpellCheckingInspection")

package beginAnswers

import kotlin.math.*

fun main() {

    println("Aylana yuzasi kiritilsin: ")
    val s = readln().toInt()

    println("Diametri: ${s / (2 * PI)}")
    println("Radiusi: ${PI * s.toDouble().pow(2)}")
}