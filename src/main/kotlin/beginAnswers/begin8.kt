@file:Suppress("SpellCheckingInspection")

package beginAnswers

import kotlin.math.PI
import kotlin.math.pow


fun main() {

    println("Doira radiusi kiritilsin: ")
    val r = readln().toDouble()

    println("Uzunligi: ${2 * PI * r}")
    println("Yuzasi: ${PI * r.pow(2)}")

}