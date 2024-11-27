package homework;

import java.util.*;

public class EIUCHRMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfBills = sc.nextInt();
        int[] valueOfBills = new int[numberOfBills];
        for (int i = 0; i < valueOfBills.length; i++) {
            valueOfBills[i] = sc.nextInt();
        }
        System.out.println(totalIncome(valueOfBills));
        sc.close();
    }

    private static long totalIncome(int[] valueOfBills) {
        double totalIncome = 0;
        int million = 1000000;
        int[] valueOfInvoice = { 2 * million, 5 * million, 10 * million, 20 * million, 50 * million, 100 * million,
                200 * million, (int) Long.MAX_VALUE };
        double[] discountRate = { 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < valueOfBills.length; i++) {
            for (int j = 0; j < valueOfInvoice.length; j++) {
                if (valueOfBills[i] <= valueOfInvoice[j]) {
                    totalIncome += valueOfBills[i] * (100 - discountRate[j]) / 100;
                    break;
                }

            }
        }
        return Math.round(totalIncome);
    }

}
