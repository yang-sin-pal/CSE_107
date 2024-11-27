package homework;

import java.util.*;

public class EIDISCOUNT2 {// Phat does not understand how to calculate input 1000000000 -> output 900550000
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cost = sc.nextDouble();
        double million = 1000000;
        double[] rangeOfCost = { 0 * million, 5 * million, 20 * million, 100 * million, 300 * million, 600 * million,
                900 * million};
        double[] discoutPercent = { 1, 0.97, 0.95, 0.93, 0.9, 0.88};
        double costRemain = cost;
        double totalPayment = 0;
        int i = 0;
        if (cost > (900 * million)) {
            costRemain = 900 * million;
            totalPayment += (cost - costRemain) * 0.85;
        }
        while (costRemain > 0) {
            // if (costRemain >= (rangeOfCost[i + 1] - rangeOfCost[i])) {
            //     totalPayment += (rangeOfCost[i + 1] - rangeOfCost[i]) * discoutPercent[i];
            // } else {
            //     totalPayment += costRemain * discoutPercent[i];
            // }
            totalPayment += Math.min(costRemain, (rangeOfCost[i + 1] - rangeOfCost[i])) * discoutPercent[i];
            // if (costRemain >= (rangeOfCost[i + 1] - rangeOfCost[i])) {
            //     costRemain -= (rangeOfCost[i + 1] - rangeOfCost[i]);
            // } else {
            //     costRemain -= costRemain;
            // }
            costRemain -= Math.min(costRemain, (rangeOfCost[i + 1] - rangeOfCost[i]));

            i++;
        }
        System.out.println((long) Math.round(totalPayment));
        sc.close();
    }
}

