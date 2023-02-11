@file:Suppress("SpellCheckingInspection")

package IntegerAnswers

fun main() {

    println("Son kiritilsin: ")

    when (val num = readln().toInt()) {
        in 1..9 -> println("Kiritilgan $num soni birliklar sinfida !")
        in 10..99 -> println("Kiritilgan $num soni o'nliklar sinfida !")
        in 100..999 -> println("Kiritilgan $num soni mingliklar sinfida !")
    }
}
