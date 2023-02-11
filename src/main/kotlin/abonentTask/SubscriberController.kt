package abonentTask

import java.time.LocalDate
import java.util.*
import kotlin.system.exitProcess

/**
 * Creator: Karimov Ozodbek
 * Date 11/02/2023
 */

private var subscriberList = ArrayList<Subscriber>()

fun main() {
    listOfSubscribers()
    showMenu()
    println("Bugungi sana: " + LocalDate.now())
    println("☆ MOBIL ALOQA OPERATORI")
}

private fun showMenu() {
    println(
        """
      ___________________________
     |  1.  Abonentlar ro'yxati  |
     |  2.  Abonent qo'shish     |
     |  3.  Abonent o'chirish    |
     |  4.  Abonent qidirish     |
     |  5.  Chiqish              |
      ___________________________
    """.trimIndent()
    )

    when (readln().toInt()) {
        1 -> showSubMenu()
        2 -> addSubscribers()
        3 -> removeSubscriber()
        4 -> searchSubscribers()
        5 -> {
            println("Salomat bo'ling, Xayr !")
            exitProcess(0)
        }
    }
}

private fun searchSubscribers() {
    println("Telefon raqam yoki Ism kiritilsin: ")
    val info = readln()

    val foundSubscriber = subscriberList.find {
       ( it.phone.trimStart('+') == info.trimStart('+') || it.name.equals(info,ignoreCase = true))
    }

    if (foundSubscriber == null) {
        println("Bunday abonent yo'q !!")
    } else {
        println("Abonent topildi: ")
        println(foundSubscriber)
    }
    showMenu()
}

private fun removeSubscriber() {
    println("Telefon raqam kiritilsin: ")
    val phone = readln().trimStart('+')

    val deletedSubscriber = subscriberList.find { it.phone.trimStart('+') == phone }

    if (deletedSubscriber == null) {
        println("Bunday abonent yo'q !!")
    } else {
        println("Abonent o'chirildi !!")
        subscriberList.remove(deletedSubscriber)
    }
    showMenu()
}

private fun addSubscribers() {
    var company = ""
    println("Kompaniya: ")
    println("1 - Ucell: ")
    println("2 - Uzmobile: ")
    println("3 - Beeline: ")
    println("Tanlang: ")
    when (readln().toInt()) {
        1 -> company = "Ucell"
        2 -> company = "Beeline"
        3 -> company = "Uzmobile"
        else -> {
            println("Bunday kompaniya mavjud emas !!")
            addSubscribers()
        }
    }
    println("Abonent ismi: ")
    val name = readln()
    println("Abonent raqami: ")
    val phone = readln()
    println("Abonent balansi: ")
    val balance = readln().toFloat()
    val subscriber = Subscriber(name, phone, balance, company)
    println("Abonent qo'shildi !")
    println("$subscriber \n")
    subscriberList.add(subscriber)
    showMenu()
}

private fun showSubMenu() {
    println(
        """
      ___________________________
     |  1.  Ucell               |
     |  2.  Beeline             |
     |  3.  Uzmobile            |
     |  4.  Barcha abonentlar   |
     |  5.  Saralash orqali     |
     |  6.  Orqaga              |
      ___________________________
    """.trimIndent()
    )

    when (readln().toInt()) {
        1 -> showSubscribers("Ucell")
        2 -> showSubscribers("Beeline")
        3 -> showSubscribers("Uzmobile")
        4 -> showSubscribers()
        5 -> showSortingMenu()
        6 -> showMenu()
    }
}

private fun showSubscribers() {
    for (subscriber in subscriberList) {
        println(subscriber.toString())
    }
    showSubMenu()
}

private fun showSubscribers(company: String) {
    for (subscriber in subscriberList) {
        if (subscriber.company.equals(company, ignoreCase = true)) {
            println(subscriber)
        }
    }
    showSubMenu()
}

private fun listOfSubscribers() {
    subscriberList.add(Subscriber("Umidjon", "998912454665", 3.34f, "BEELINE"))
    subscriberList.add(Subscriber("Nozim", "998912384636", 13.34f, "BEELINE"))
    subscriberList.add(Subscriber("Kozim", "998932444439", 34.4f, "UCELL"))
    subscriberList.add(Subscriber("Abror", "998994554651", 5.24f, "UZMOBILE"))
    subscriberList.add(Subscriber("Nodir", "998972554600", 2.14f, "UMS"))
}

private fun showSortingMenu() {
    println(
        """
      ___________________________
     |         SARALASH            |
     |                             |
     |  1.  Balans bo'yicha:       |
     |  2.  Kompaniyasi bo'yicha   |
     |  3.  Abonent ismi bo'yicha  |
     |  5.  Orqaga                 |
      ___________________________
    """.trimIndent())

    when (readln().toInt()) {
        1 -> sortByType(1)
        2 -> sortByType(2)
        3 -> sortByType(3)
        4 -> showSubMenu()
        else -> println("Bunday saralash yo'q !!")
    }
    showMenu()
}

private fun sortByType(type: Int) {
    when (type) {
        1 -> subscriberList.sortBy { it.balance.toDouble() }
        2 -> subscriberList.sortBy { it.company }
        3 -> subscriberList.sortBy { it.name }
    }
    showSubscribers()
}
