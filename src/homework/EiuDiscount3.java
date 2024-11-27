package homework;

import java.util.Scanner;

public class EiuDiscount3 { // rewrite follow Oracle's Java Code Conventions by ChatGPT

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long totalAmount = scanner.nextLong();
        byte[] offersReceived = new byte[3];

        for (byte i = 0; i < offersReceived.length; i++) {
            offersReceived[i] = scanner.nextByte();
        }

        long amountToPay = calculateAmountAfterChristmasDiscount(totalAmount);

        for (byte offer : offersReceived) {
            if (offer == 1) {
                amountToPay *= 0.98;
            }
        }

        System.out.println(amountToPay);
        scanner.close();
    }

    private static long calculateAmountAfterChristmasDiscount(long totalAmount) {
        long amountAfterDiscount = 0;
        long[] discountRates = {0, 3, 5, 7, 10, 12, 15};
        long million = 1_000_000;
        long[] moneyBrackets = {0, 5 * million, 20 * million, 100 * million, 300 * million, 600 * million, 900 * million};

        if (totalAmount > 900 * million) {
            amountAfterDiscount += (totalAmount - 900 * million) * (100.0 - 15.0) / 100.0;
            totalAmount = 900 * million;
        }

        byte bracketIndex = 0;
        while (totalAmount > 0) {
            long currentBracketLimit = moneyBrackets[bracketIndex + 1] - moneyBrackets[bracketIndex];
            amountAfterDiscount += Math.min(totalAmount, currentBracketLimit) * (100 - discountRates[bracketIndex]) / 100.0;
            totalAmount -= Math.min(totalAmount, currentBracketLimit);
            bracketIndex++;
        }

        return amountAfterDiscount;
    }
}
