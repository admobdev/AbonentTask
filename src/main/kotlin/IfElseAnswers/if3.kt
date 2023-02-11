@file:Suppress("SpellCheckingInspection")

package IfElseAnswers

fun main() {
    println("Son kiritilsin: ")
    var num = readln().toInt()

    if (num > 0) {
        num += 1
        println("Siz kiritgan son qiymati 1 ga oshdi: $num")
    } else {
        num -= 2
        println("Siz kiritgan son 2 ga kamaydi: $num")
    }
}