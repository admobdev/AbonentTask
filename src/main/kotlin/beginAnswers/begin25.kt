@file:Suppress("SpellCheckingInspection")

package beginAnswers

import kotlin.math.*

fun main() {

    println("A son kiritilsin: ")
    var a = readln().toInt()
    println("B son kiritilsin: ")
    var b = readln().toInt()
    println("C son kiritilsin: ")
    var c = readln().toInt()

    val temp = c
    c = b
    b = a
    a = temp

    println("A son: $a")
    println("B son: $b")
    println("C son: $c")
}