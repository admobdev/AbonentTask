@file:Suppress("SpellCheckingInspection")

package IfElseAnswers

fun main() {
    var count = 0
    println("1 - son kiritilsin: ")
    val num1 = readln().toInt()
    println("2 - son kiritilsin: ")
    val num2 = readln().toInt()
    println("3 - son kiritilsin: ")
    val num3 = readln().toInt()

    if (num1 > 0) count++
    if (num2 > 0) count++
    if (num3 > 0) count++
    println("Kirilgan sonlar ichida $count ta musbat son bor !!")

}