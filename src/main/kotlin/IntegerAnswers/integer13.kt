@file:Suppress("SpellCheckingInspection")

package IntegerAnswers

fun main() {

    println("Son kiritilsin: ")
    val num = readln().toInt()
    val on = num / 10 % 10

    val(b, y) = num % 10 to num / 100
    println("Birliklar: $b O'nliklar: $on Yuzliklar: $y")
}
