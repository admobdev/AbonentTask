@file:Suppress("SpellCheckingInspection")

package beginAnswers


fun main() {
    println("A kiritilsin: ")
    val a = readln().toInt()
    println("B kiritilsin: ")
    val b = readln().toInt()
    println("C kiritilsin: ")
    val c = readln().toInt()

    println("Hajmi: ${a * b * c}")
    println("To'la sirti: ${2 * (a * b + b * c + a * c)}")
}