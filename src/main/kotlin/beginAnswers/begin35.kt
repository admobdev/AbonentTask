@file:Suppress("SpellCheckingInspection")

package beginAnswers

import kotlin.math.*

fun main() {

    println("X kg shokolad kiritilsin: ")
    val x = readln().toInt()
    println("Necha so'm turishi kiritilsin: ")
    val s = readln().toInt()
    println("Y kg konfet kiritilsin: ")
    val y = readln().toInt()
    println("B so'm uchun qiymat kiritilsin: ")
    val b = readln().toInt()

    println("Shokolad, Konfetdan: ${(s / x) / (b / y)} so'm qimmat turadi")
}