@file:Suppress("SpellCheckingInspection")

package beginAnswers

import kotlin.math.*

fun main() {

    println("Qayiq tezligi: ")
    val v = readln().toInt()
    println("Oqim tezligi: ")
    val u = readln().toInt()
    println("Harakatlanish vaqti: ")
    val t1 = readln().toInt()
    println("Oqimga qarshi : ")
    val t2 = readln().toInt()

    println("Yo'nalishi: ${ (t1 * v) + (t2 * (v - u) )}")
}