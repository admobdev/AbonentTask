package AbonentHomeWork;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class SubscriberJava {
    private final String name;
    private final String phone;
    private final String company;
    private final float balance;

    public SubscriberJava(String name, String phone, float balance, String company) {
        this.name = name;
        this.phone = phone;
        this.balance = balance;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getCompany() {
        return company;
    }

    public float getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return  name + " - " +
                Utility.phoneFormatter(phone) +
                " -> " + String.format("%.2f$", balance) +
                " | " + company.toUpperCase();
    }
}
