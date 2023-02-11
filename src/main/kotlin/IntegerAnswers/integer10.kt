@file:Suppress("SpellCheckingInspection")

package IntegerAnswers

fun main() {

    println("Son kiritilsin: ")

    when (val num = readln().toInt()) {
        in 100..999 -> println("Kiritilgan $num soni mingliklar sinfida !")
    }
}
