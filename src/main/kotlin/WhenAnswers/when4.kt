@file:Suppress("SpellCheckingInspection")

package WhenAnswers

fun main() {
    println("1..12 gacha raqam tanlansin: ")

    when (readln().toInt()) {
        1, 2, 12 -> println("Qish fasli")
        3, 4, 5 -> println("Bahor fasli")
        6, 7, 8 -> println("Yoz fasli")
        9, 10, 11 -> println("Kuz fasli")
        else -> println("Bunday fasl yo'q, (xato)")
    }
}