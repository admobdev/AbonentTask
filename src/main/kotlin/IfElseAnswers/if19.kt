@file:Suppress("SpellCheckingInspection")

package IfElseAnswers

fun main() {

    println("1 - son kiritilsin: ")
    val num1 = readln().toInt()
    println("2 - son kiritilsin: ")
    val num2 = readln().toInt()
    println("3 - son kiritilsin: ")
    val num3 = readln().toInt()

   if (num1 == num2){
       println("$num3 uchinchi son")
   }else if (num2 == num3){
       println("$num1 uchinchi son")
   }else if (num3 == num1){
       println("$num2 uchinchi son")
   }
}
