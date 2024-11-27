package homework;

import java.util.*;

public class EiuSaving3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long totalMoney = scanner.nextLong();

        int numberMonth = scanner.nextInt();

        double totalInterestRate = sumInterestFollowSaving2(numberMonth);

        double monthlyDeposit = totalMoney / totalInterestRate;

        System.out.printf(Locale.ENGLISH,"%.4f",monthlyDeposit);
    }

    private static double sumInterestFollowSaving2(int numberMonth) {
        double[] interest_Rate = { 0, 3.9, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92 };

        double sumInterest = 0;
        for (int i = numberMonth; i > 0; i--) {
            int year = i / 12;
            int month = i % 12;
            sumInterest += Math.pow(1 + interest_Rate[12] / 100, year) * (1
                    + interest_Rate[month] * (month) / 12 / 100);
        }

        return sumInterest;
    }
}
