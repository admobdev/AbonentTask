@file:Suppress("SpellCheckingInspection")

package beginAnswers

import kotlin.math.*


fun main() {

    println("Aylana uzunligi kiritilsin: ")
    val l = readln().toInt()

    println("Radiusi: ${l / (2 * PI)}")
    println("Yuzasi: ${PI * l.toDouble().pow(2)}")
}