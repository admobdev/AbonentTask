@file:Suppress("SpellCheckingInspection")

package IntegerAnswers

fun main() {

    println("Son kiritilsin: ")
    val num = readln().toInt()

    when {
        num in 1..9 -> println("Kiritilgan $num soni birliklar sinfida !")
        num in 10..99 -> println("Kiritilgan $num soni o'nliklar sinfida !")
        num in 100..999 -> println("Kiritilgan $num soni mingliklar sinfida !")
    }
}
