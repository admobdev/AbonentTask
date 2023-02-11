@file:Suppress("SpellCheckingInspection")

package IfElseAnswers

fun main() {

    println("1 - son kiritilsin: ")
    var num1 = readln().toInt()
    println("2 - son kiritilsin: ")
    var num2 = readln().toInt()
    println("3 - son kiritilsin: ")
    var num3 = readln().toInt()

    if (num1 > num2 && num2 < num3 || num1 < num2 && num2 < num3) {
        println("${(num1 * 2)} ${num2 * 2} ${num3 * 2}")
    }else {
        num1 = num2
        num2 = num3
        num3 = num1

        println("$num1 $num2 $num3")
    }
}
