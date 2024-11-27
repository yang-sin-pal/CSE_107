package homework;


import java.util.Scanner;

public class EIAPP21222FQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_Month = sc.nextInt();
        double[] deposits_Each_Month = new double[number_Month];
        for (int i = 0; i < number_Month; i++) {
            deposits_Each_Month[i] = sc.nextDouble();
        }
        double[] interest_Rate = { 0, 3.9, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92 };

        double maximum_Amount_Of_Money = 0;
        int indexDeposit = 0;
        for (int i = number_Month; i > 0; i--) {
            int year = i / 12;
            int month = i % 12;
            maximum_Amount_Of_Money += (deposits_Each_Month[indexDeposit]
                        * (Math.pow(1 + interest_Rate[11] / 100, year) * (1
                                + interest_Rate[month] * month / 12 / 100)));
            indexDeposit++;
        }

        System.out.println(Math.round(maximum_Amount_Of_Money));
        sc.close();
    }
}

