@file:Suppress("SpellCheckingInspection")

package beginAnswers

import kotlin.math.*

fun main() {

    println("X kg konfet kiritilsin: ")
    val x = readln().toInt()
    println("Necha so'm turishi kiritilsin: ")
    val s = readln().toInt()
    println("Y kg kiritilsin: ")
    val y = readln().toInt()

    println(println("1 kg konfet: ${s / x}"))
    println("Y kg konfet: ${(s / x) * y}")

}