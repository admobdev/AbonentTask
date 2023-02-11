@file:Suppress("SpellCheckingInspection")

package beginAnswers

fun main() {
    println("A tomon kiritilsin: ")
    val a = readln().toInt()
    println("B tomon kiritilsin: ")
    val b = readln().toInt()

    println("Yuzasi: ${a * b}")
    println("Perimetri: ${2 * (a * b)}")
}