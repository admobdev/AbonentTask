@file:Suppress("SpellCheckingInspection")

package beginAnswers

import kotlin.math.pow

fun main() {
    println("Kubning yon tomoni kiritilsin: ")
    val k = readln().toInt()

    println("Hajmi: ${k.toDouble().pow(3)}")
    println("To'la sirti: ${6 * k.toDouble().pow(2)}")
}