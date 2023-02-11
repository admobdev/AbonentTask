package abonentTask

import java.util.*

/**
 *Creator: Karimov Ozodbek
 *Date 11/02/2023
 */
data class Subscriber(val name: String, val phone: String, val balance: Float, val company: String) {

    override fun toString(): String {
        return  "$name - " +
                "${phoneFormatter(phone)} -> " +
                "${"%.2f$".format(balance)} " +
                company.uppercase(Locale.getDefault())
    }
}

fun phoneFormatter(phone: String): String {
    val formattedPhone = phone.replaceFirst("^\\+", "")

    return formattedPhone.replace(
        Regex(
            "(\\d{3})(\\d{2})(\\d{3})(\\d{2})(\\d{2})"
        ),
        "+$1($2)$3-$4-$5"
    )
}
