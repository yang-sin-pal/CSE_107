package homework;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class EIPURCHASE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        long V = sc.nextLong();

        long N = sc.nextLong();
        int T = sc.nextInt();
        double M = sc.nextDouble();
        long X = V - N;
        double payMonthly = 0;

        payMonthly = (X * Math.pow((M + 1), T)) / ((Math.pow((M + 1), T) - 1) / M);

        System.out.println(Math.floor(payMonthly));

        sc.close();
    }
}
