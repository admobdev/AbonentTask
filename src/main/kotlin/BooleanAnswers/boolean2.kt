@file:Suppress("SpellCheckingInspection")

package BooleanAnswers

fun main() {
    println("Son kiritilsin: ")
    val positive = readln().toInt()
    when{
        positive > 0 -> println("Musbat")
        positive < 0 -> println("Manfiy")
        else -> println("Xato")
    }
}