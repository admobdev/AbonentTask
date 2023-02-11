@file:Suppress("SpellCheckingInspection")

package beginAnswers

import kotlin.math.*

fun main() {

    println("X son kiritilsin: ")
    val x = readln().toDouble()

    println("Natija: ${ 4 * (x- 3).pow(6) - 7 * (x- 3).pow(3) + 2}")
}