@file:Suppress("SpellCheckingInspection")

package IfElseAnswers

fun main() {

    println("1 - son kiritilsin: ")
    var num1 = readln().toInt()
    println("2 - son kiritilsin: ")
    var num2 = readln().toInt()

    if (num1 > num2) {
        num2 = num1.also { num1 = num2 }
        println("Kiritilgan sonlar ichida $num1 kattasi !!")
        println("Kiritilgan sonlar ichida $num2 kichigi !!")
    } else {
        num2 = num1.also { num1 = num2 }
        println("Kiritilgan sonlar ichida $num2 kattasi !!")
        println("Kiritilgan sonlar ichida $num1 kichigi !!")
    }
}