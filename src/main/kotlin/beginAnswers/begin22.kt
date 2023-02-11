@file:Suppress("SpellCheckingInspection")

package beginAnswers

import kotlin.math.*

fun main() {

    println("X1 tomoni kiritilsin: ")
    val x1 = readln().toDouble()
    println("Y1 tomoni kiritilsin: ")
    val y1 = readln().toDouble()
    println("X2 tomoni kiritilsin: ")
    val x2 = readln().toDouble()
    println("Y2 tomoni kiritilsin: ")
    val y2 = readln().toDouble()
    println("X3 tomoni kiritilsin: ")
    val x3 = readln().toDouble()
    println("Y3 tomoni kiritilsin: ")
    val y3 = readln().toDouble()


    val a = sqrt( (x2 - x1).pow(2 + (y2 - y1).pow(2)))
    val b = sqrt( (x3 - x1).pow(2 + (y3 - y1).pow(2)))
    val c = sqrt( (x3 - x2).pow(2 + (y3 - y2).pow(2)))

    val per = a + b + c

    println("Yuzasi: ${sqrt(per * (per - a) * (per - b) * (per - c))}")
    println("Perimetri: $per")
}