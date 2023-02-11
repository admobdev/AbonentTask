@file:Suppress("SpellCheckingInspection")

package BooleanAnswers

fun main() {
    println("1 - son kiritilsin: ")
    val num1 = readln().toInt()
    println("2 - son kiritilsin: ")
    val num2 = readln().toInt()

    if (num1 > 2) {
        println("Birinchi son ikkidan katta : ${num1 > 2}")
    } else {
        println("Jumlaga to'gri kelmadi")
    }

    if (num2 <= 3) {
        println("Ikki nchi son 3 dan katta : ${num2 <= 3}")
    } else {
        println("Jumlaga to'gri kelmadi")
    }
}