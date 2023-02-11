@file:Suppress("SpellCheckingInspection")

package ForAnswers

fun main() {
    println("Son kiritilsin: ")
    val num = readln().toInt()
    println("Ko'payuvchi son kiritilsin: ")
    val incNum = readln().toInt()

    for (i in 1..incNum){
        println(num)
    }
}