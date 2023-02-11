@file:Suppress("SpellCheckingInspection")

package IfElseAnswers

fun main() {
    var count1 = 0
    var count2 = 0
    println("1 - son kiritilsin: ")
    val num1 = readln().toInt()
    println("2 - son kiritilsin: ")
    val num2 = readln().toInt()
    println("3 - son kiritilsin: ")
    val num3 = readln().toInt()

    if (num1 > 0) count1++ else count2++
    if (num2 > 0) count1++ else count2++
    if (num3 > 0) count1++ else count2++

    println("Kirilgan sonlar ichida $count1 ta musbat va $count2 manfiy son bor !!")

}