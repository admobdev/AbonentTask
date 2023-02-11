@file:Suppress("SpellCheckingInspection")

package IfElseAnswers

fun main() {

    println("1 - son kiritilsin: ")
    var num1 = readln().toInt()
    println("2 - son kiritilsin: ")
    var num2 = readln().toInt()

    if (num1 != num2) {
        println("Kiritilgan sonlar xar xil va ularning yig'indisi: ${num1 + num2}")
    } else if (num1 == num2) {
        println("Kiritilgan sonlar bir xil va natija: 0")
    } else
        println("Bunday shart yo'q !!")
}