package AbonentHomeWork;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MobileController {
    static ArrayList<SubscriberJava> subscriberJavas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        listOfSubscribers();
        showMenu();
        System.out.println("Bugungi sana: " + LocalDate.now());
        System.out.println("☆ MOBIL ALOQA OPERATORI");
    }

    private static void showMenu() {
        System.out.println("1 - Abonentlar ro'yxati:");
        System.out.println("2 - Abonent qo'shish:");
        System.out.println("3 - Abonent o'chirish:");
        System.out.println("4 - Abonent qidirish:");
        System.out.println("5 - Chiqish:");

        switch (scanner.nextInt()) {
            case 1 -> showSubMenu();
            case 2 -> addSubscribers();
            case 3 -> removeSubscribers();
            case 4 -> searchSubscribers();
            case 5 -> {
                System.out.println("Salomat bo'ling, Xayr !");
                System.exit(0);
            }
        }
    }

    private static void searchSubscribers() {
        System.out.println("Telefon raqam kiritilsin: ");
        String phone = scanner.next();

        if (phone.startsWith("+"))
            phone = phone.substring(1);

        SubscriberJava foundSubscriberJava = null;
        for (int i = 0; i < subscriberJavas.size(); i++) {
            String currentphone = subscriberJavas.get(i).getPhone();

            if (currentphone.startsWith("+"))
                currentphone = currentphone.substring(1);

                if (currentphone.equals(phone)) {
                    foundSubscriberJava = subscriberJavas.get(i);
                    break;
                }
        }
        if (foundSubscriberJava == null){
            System.out.println("Bunday abonent yo'q !!");
        }else{
            System.out.println("Abonent topildi !!");
            System.out.println(foundSubscriberJava);
        }
        showMenu();
    }

    private static void removeSubscribers() {
        System.out.println("Telefon raqam kiritilsin: ");
        String phone = scanner.next();

        if (phone.startsWith("+"))
            phone = phone.substring(1);

        SubscriberJava deletedSubscribers = null;
        for (int i = 0; i < subscriberJavas.size(); i++) {
            String currentphone = subscriberJavas.get(i).getPhone();

            if (currentphone.startsWith("+"))
                currentphone = currentphone.substring(1);

            if (currentphone.equals(phone)) {
                deletedSubscribers = subscriberJavas.get(i);
                break;
            }
        }
        if (deletedSubscribers == null){
            System.out.println("Bunday abonent yo'q !!");
        }else{
            System.out.println("Abonent o'chirildi !!");
            System.out.println(deletedSubscribers);
        }
        showMenu();
    }

    private static void addSubscribers() {
        Scanner sc = new Scanner(System.in);
        String company = "";
        System.out.println("Kompamiya: ");
        System.out.println("1 - Ucell: ");
        System.out.println("2 - Uzmobile: ");
        System.out.println("3 - Beeline: ");
        System.out.println("Tanlang: ");
        switch (sc.nextInt()) {
            case 1 -> company = "Ucell";
            case 2 -> company = "Beeline";
            case 3 -> company = "Uzmobile";
            default -> {
                System.out.println("Bunday kompaniya mavjud emas !!");
                addSubscribers();
            }
        }
        System.out.println("Abonent ismi: ");
        String name = sc.next();
        System.out.println("Abonent raqami: ");
        String phone = sc.next();
        System.out.println("Abonent balansi: ");
        float balance = sc.nextFloat();

        SubscriberJava subscriberJava = new SubscriberJava(name,phone,balance,company);
        System.out.println("Abonent qo'shildi !");
        System.out.println(subscriberJava + "\n");
        subscriberJavas.add(subscriberJava);
        showMenu();
    }

    private static void showSubMenu() {
        System.out.println("1 - Ucell");
        System.out.println("2 - Beeline");
        System.out.println("3 - Uzmobile");
        System.out.println("4 - Barcha abonentlar");
        System.out.println("5 - Saralangan taribda: ");
        System.out.println("6 - Orqaga: ");

        switch (scanner.nextInt()) {
            case 1 -> showSubscribers("Ucell");
            case 2 -> showSubscribers("Beeline");
            case 3 -> showSubscribers("Uzmobile");
            case 4 -> showSubscribers();
            case 5 -> showSortingMenu();
            case 6 -> showMenu();
        }
    }

    private static void showSubscribers() {
        for (SubscriberJava subscriberJava : subscriberJavas) {
            System.out.println(subscriberJava.toString());
        }
        showSubMenu();
    }

    private static void showSubscribers(String company) {
        for (SubscriberJava subscriberJava : subscriberJavas) {
            if (subscriberJava.getCompany().equalsIgnoreCase(company)) {
                System.out.println(subscriberJava);
            }
        }
        showSubMenu();
    }

    private static void listOfSubscribers() {
        subscriberJavas.add(new SubscriberJava("Umidjon", "998912454665", 3.34f, "BEELINE"));
        subscriberJavas.add(new SubscriberJava("Nozim", "998912384636", 13.34f, "BEELINE"));
        subscriberJavas.add(new SubscriberJava("Kozim", "998932444439", 34.4f, "UCELL"));
        subscriberJavas.add(new SubscriberJava("Abror", "998994554651", 5.24f, "UZMOBILE"));
        subscriberJavas.add(new SubscriberJava("Nodir", "998972554600", 2.14f, "UMS"));
    }

    public static void showSortingMenu() {
        System.out.println("Saralash: ");
        System.out.println("1 - Balans holati bo'yicha: ");
        System.out.println("2 - Kompaniya nomi bo'yicha: ");
        System.out.println("3 - Abonent ismi bo'yicha: ");
        System.out.println("4 - Orqaga: ");
        System.out.println("Tanlang: ");
        switch (scanner.nextInt()) {
            case 1 -> sortByType(1);
            case 2 -> sortByType(2);
            case 3 -> sortByType(3);
            case 4 -> showSubMenu();
            default -> System.out.println("Bunday saralash yo'q !!");
        }
        showMenu();

    }

    private static void sortByType(int type) {
        switch (type) {
            case 1 -> subscriberJavas.sort(Comparator.comparingDouble(SubscriberJava::getBalance));
            case 2 -> subscriberJavas.sort(Comparator.comparing(SubscriberJava::getCompany));
            case 3 -> subscriberJavas.sort(Comparator.comparing(SubscriberJava::getName));
        }
        showSubscribers();
    }
}
