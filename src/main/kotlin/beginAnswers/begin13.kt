@file:Suppress("SpellCheckingInspection")
package beginAnswers

import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.pow
import kotlin.math.sqrt


fun main() {

    println("A katet kiritilsin: ")
    val a = readln().toInt()
    println("B katet kiritilsin: ")
    val b = readln().toInt()

    val gpo = sqrt(a.toDouble().pow(2 + b.toDouble().pow(2)))
    println("Gipotenuzasi: $gpo")
    println("Perimetri: ${a + b + gpo}")
}