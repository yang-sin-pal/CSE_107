package homework;

import java.util.*;

public class EIMONE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_b = sc.nextInt();
        int[] denominations = { 20, 10, 5, 1 };
        for (int i = 0; i < denominations.length; i++) {
            int notes = number_b / denominations[i];
            if (notes != 0) {
                System.out.println(denominations[i] + " " + notes);
            }
            number_b %= denominations[i];
        }
        sc.close();
    }
}
