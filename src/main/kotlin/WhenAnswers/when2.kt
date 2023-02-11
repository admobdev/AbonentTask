@file:Suppress("SpellCheckingInspection")

package WhenAnswers

fun main() {
    println("1..7 gacha raqam tanlansin: ")

    when(readln().toInt()){
        1 -> println("Duyshanba")
        2 -> println("Seyshanba")
        3 -> println("Chorshanba")
        4 -> println("Payshanba")
        5 -> println("Juma")
        6 -> println("Shanba")
        7 -> println("Yakshanba")
        else -> println("Bunday kun yo'q")
    }
}