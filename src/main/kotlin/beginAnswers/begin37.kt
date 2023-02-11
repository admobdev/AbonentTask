@file:Suppress("SpellCheckingInspection")

package beginAnswers

import kotlin.math.*

fun main() {

    println("1 - mashina tezligi: ")
    val v1 = readln().toInt()
    println("2 - mashina tezligi: ")
    val v2 = readln().toInt()
    println("Orasidagi masofa: ")
    val s = readln().toInt()
    println("Qaancha vaqtdan keyin: ")
    val t = readln().toInt()

    println("Javob: ${s + (v1 + v2) * t}")
}