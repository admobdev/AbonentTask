@file:Suppress("SpellCheckingInspection")

package IfElseAnswers

fun main() {

    println("1 - son kiritilsin: ")
    val num1 = readln().toInt()
    println("2 - son kiritilsin: ")
    val num2 = readln().toInt()

    if (num1 > num2) {
        println("Kiritilgan sonlar ichida $num1 kattasi !!")
    }else{
        println("Kiritilgan sonlar ichida $num2 kattasi !!")
    }

}