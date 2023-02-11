@file:Suppress("SpellCheckingInspection")

package WhenAnswers

fun main() {
    println("1..12 gacha raqam tanlansin: ")

    when (readln().toInt()) {
        1 -> println("Yanvar oyida 31 ta kun bor")
        2 -> println("Fevral oyida 28 ta kun bor")
        3 -> println("Mart oyida 31 ta kun bor")
        4 -> println("Aprel oyida 30 ta kun bor")
        5 -> println("May oyida 31 ta kun bor")
        6 -> println("Iyun oyida 30 ta kun bor")
        7 -> println("Iyul oyida 31 ta kun bor")
        8 -> println("August oyida 31 ta kun bor")
        9 -> println("Sentabr oyida 30 ta kun bor")
        10 -> println("Oktabr oyida 31 ta kun bor")
        11 -> println("Noyabr oyida 30 ta kun bor")
        12 -> println("Dekabr oyida 31 ta kun bor")
        else -> println("Bunday fasl yo'q, (xato)")
    }
}