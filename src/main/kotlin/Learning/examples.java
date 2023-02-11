package Learning;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class xmn {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == 15) {
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

