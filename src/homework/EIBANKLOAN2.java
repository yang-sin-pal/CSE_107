package homework;

import java.util.Locale;
import java.util.Scanner;

public class EIBANKLOAN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        long a_new_house_worth = sc.nextLong();
        long could_pay_per_month = sc.nextLong();
        double interest_rate = sc.nextDouble();
        long pays_off_for_how_long = 0;
        // pays_off_for_how_long = (long) Math.ceil(a_new_house_worth * (1 +
        // interest_rate/100) /could_pay_per_month);
        pays_off_for_how_long = (long) Math.ceil(
                Math.log(-could_pay_per_month / (a_new_house_worth * interest_rate / 12 / 100 - could_pay_per_month))
                        / Math.log(1 + interest_rate / 12 / 100));
        System.out.println(pays_off_for_how_long);
        sc.close();
    }
}
