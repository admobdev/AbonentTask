@file:Suppress("SpellCheckingInspection")

package IntegerAnswers

fun main() {

    println("2 xonali son kiritilsin: ")
    val num = readln().toInt()

    val (one, two) = num % 10 to num / 10
    println("Almashtirilgan holatida: birlik $one  o'nlik $two")
}
