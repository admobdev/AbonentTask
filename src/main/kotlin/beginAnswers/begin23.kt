@file:Suppress("SpellCheckingInspection")

package beginAnswers

import kotlin.math.*

fun main() {

    println("A son kiritilsin: ")
    var a = readln().toInt()
    println("B son kiritilsin: ")
    var b = readln().toInt()

    a = b.also { b = a }

    println("A son: $a")
    println("B son: $b")
}