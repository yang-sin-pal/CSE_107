package homework;

import java.util.*;

public class EIGROSS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long netSalary = sc.nextLong();
        long million = 1000000;
        long[] taxable_Income = { 0, 5 * million, 10 * million, 18 * million, 32 * million, 52 * million, 80 * million,
                Long.MAX_VALUE };
        long[] rate = { 5, 10, 15, 20, 25, 30, 35 };
        System.out.println(grossSalary(netSalary, taxable_Income, rate));
        sc.close();
    }

    static long grossSalary(long netSalary, long[] taxable_Income, long[] rate) {
        long million = 1000000;
        double grossSalary = 0;
        if (netSalary <= 11 * million) {
            grossSalary = netSalary;
        } else {
            long afteAssisting = netSalary - 11 * million;
            grossSalary += 11 * million;

            int i = 0;
            while (afteAssisting > 0) {
                grossSalary += Math.min(taxable_Income[i + 1] - taxable_Income[i],
                        afteAssisting* 100/(100 - rate[i]));
                afteAssisting -= Math.min
                    ((taxable_Income[i + 1] - taxable_Income[i])* (100 - rate[i]) / 100,
                    afteAssisting) ;
                i++;
            }
        }
        return Math.round(grossSalary);
    }
}
