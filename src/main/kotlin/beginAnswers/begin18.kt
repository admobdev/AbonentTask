@file:Suppress("SpellCheckingInspection")

package beginAnswers

import kotlin.math.*

fun main() {

    println("A kesma kiritilsin: ")
    val a = readln().toInt()
    println("B kesma kiritilsin: ")
    val b = readln().toInt()
    println("C kesma kiritilsin: ")
    val c = readln().toInt()

    println("A va C kesmalar uzunligi: ${c - a}")
    println("B va C kesmalar uzunligi:  ${c - b}")
    println("Kesmalar yig'indisi: ${(c - a) + (c - b)}")

}