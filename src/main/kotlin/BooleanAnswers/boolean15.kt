@file:Suppress("SpellCheckingInspection")

package BooleanAnswers

fun main() {
    println("1 - son kiritilsin: ")
    val num1 = readln().toInt()
    println("2 - son kiritilsin: ")
    val num2 = readln().toInt()
    println("3 - son kiritlsin: ")
    val num3 = readln().toInt()


    println(
        "Jumlaga ko'ra natija: ${
                    num1 < 0 && num2 > 0 && num3 > 0 ||
                    num1 > 0 && num2 < 0 && num3 > 0 ||
                    num1 > 0 && num2 > 0 && num3 < 0
        } bo'ladi"
    )

    println("Jumlaga ko'ra natija: ${num1 * num2 * num3 < 0} bo'ladi")

}