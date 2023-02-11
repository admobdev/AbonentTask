@file:Suppress("SpellCheckingInspection")

package ForAnswers

fun main() {
    println("A son kiritilsin: ")
    val a = readln().toInt()
    println("B son kiritilsin: ")
    val b = readln().toInt()

    for ((counter, i) in (a..b).withIndex()) {
        println("Raqamlar -> $i Sanog'i -> ${counter + 1}")
    }
}