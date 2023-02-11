package AbonentHomeWork;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Utility {

    public static String phoneFormatter(String phone) {
        if (phone.startsWith("+"))
            phone = phone.substring(1);

        char[] chars = phone.toCharArray();
        return String.format(
                "+%s%s%s(%s%s)-%s%s%s-%s%s-%s%s",
                chars[0],
                chars[1],
                chars[2],
                chars[3],
                chars[4],
                chars[5],
                chars[6],
                chars[7],
                chars[8],
                chars[9],
                chars[10],
                chars[11]
        );
    }
}
