@file:Suppress("SpellCheckingInspection")

package BooleanAnswers

fun main() {
    println("2 xonali musbat son kiritilsin: ")
    val num = readln().toInt()

    if (num in 10..99 && num % 2 == 0){
        println("Jumlaga ko'ra natija: true")
    }else {
        println("Jumlaga ko'ra natija: false")
    }
}