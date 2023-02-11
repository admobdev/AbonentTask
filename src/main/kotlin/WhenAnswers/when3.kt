@file:Suppress("SpellCheckingInspection")

package WhenAnswers

fun main() {
    println("1..5 gacha raqam tanlansin: ")

    when(readln().toInt()){
        1 -> println("Yomon")
        2 -> println("Qoniqarsiz")
        3 -> println("Qoniqarli")
        4 -> println("Yaxshi")
        5 -> println("A'lo")
        else -> println("Bunday tanlov yo'q, (xato)")
    }
}