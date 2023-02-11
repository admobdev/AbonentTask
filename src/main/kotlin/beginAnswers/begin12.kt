@file:Suppress("SpellCheckingInspection")
package beginAnswers

import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.pow
import kotlin.math.sqrt


fun main() {

    println("1 - son kiritilsin: ")
    val a = readln().toInt()
    println("2 -  son kiritilsin: ")
    val b = readln().toInt()

    println("Yig'indisi: ${a + b}")
    println("Ko'paytmasi: ${a * b}")
    println("1 - son moduli: ${abs(a)}")
    println("2 - son moduli: ${abs(b)}")
}