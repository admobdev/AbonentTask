@file:Suppress("SpellCheckingInspection")

package IfElseAnswers

fun main() {

    println("1 - son kiritilsin: ")
    val num1 = readln().toInt()
    println("2 - son kiritilsin: ")
    val num2 = readln().toInt()
    println("3 - son kiritilsin: ")
    val num3 = readln().toInt()

    if (num1 < num2 && num1 < num3) {
        println("Kiritilgan sonlar ichida $num1 kichigi !!")
        if (num2 < num3) {
            println("Kiritilgan sonlar ichida $num3 va $num2 kattasi !!")
        } else {
            println("Kiritilgan sonlar ichida $num2 va $num3 kattasi !!")
        }
    } else if (num2 < num1 && num2 < num3) {
        println("Kiritilgan sonlar ichida $num2 kichigi !!")
        if (num1 < num3) {
            println("Kiritilgan sonlar ichida $num3 va $num1 kattasi !!")
        } else {
            println("Kiritilgan sonlar ichida $num1 va $num2 kattasi !!")
        }
    } else if (num3 < num1 && num3 < num2) {
        println("Kiritilgan sonlar ichida $num3 kichigi !!")
        if (num2 < num1) {
            println("Kiritilgan sonlar ichida $num1 va $num2 kattasi !!")
        } else {
            println("Kiritilgan sonlar ichida $num2 va $num1 kattasi !!")

        }
    }
}
