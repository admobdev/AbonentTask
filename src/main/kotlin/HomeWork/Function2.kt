package HomeWork

/**
 *Creator: Karimov Ozodbek
 *Date 02/02/2023
 */
fun main() {
    add(5, 6)
    println(add(5.0, 6.0))
}

fun add(son1: Int, son2: Int) {
    println(son1 + son2)
}

fun add(son1: Double, son2: Double): Double {
    return son1 + son2
}