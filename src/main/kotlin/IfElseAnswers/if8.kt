@file:Suppress("SpellCheckingInspection")

package IfElseAnswers

fun main() {

    println("1 - son kiritilsin: ")
    val num1 = readln().toInt()
    println("2 - son kiritilsin: ")
    val num2 = readln().toInt()

    if (num1 < num2) {
        println("Birinchi son( $num1 ) kichigi !!")
    }else{
        println("Ikkinchi son( $num2 ) kichigi !!")
    }

}