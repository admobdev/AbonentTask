@file:Suppress("SpellCheckingInspection")

package beginAnswers

import kotlin.math.*

fun main() {

    println("X1 tomoni kiritilsin: ")
    val x1 = readln().toInt()
    println("Y1 tomoni kiritilsin: ")
    val y1 = readln().toInt()
    println("X2 tomoni kiritilsin: ")
    val x2 = readln().toInt()
    println("Y2 tomoni kiritilsin: ")
    val y2 = readln().toInt()

    val x = x2 - x1
    val y = y2 - y1
    println("Masofa: ${sqrt(x.toDouble().pow(2) + y.toDouble().pow(2))}")
}