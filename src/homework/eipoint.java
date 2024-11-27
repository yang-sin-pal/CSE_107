package homework;

import java.util.*;

public class eipoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] exchangeGrade = {90,85,80,75,70,65,60,55,53,52,50,0};
        String[] textGrade = {"A","A-","B+","B","B-","C+","C","C-","D+","D","D-","F"};
        int studentScore = sc.nextInt();
        for (int i = 0; i < textGrade.length; i++) {
            if (studentScore >= exchangeGrade[i]) {
                System.out.println(textGrade[i]);
                break;
            }
        }
        sc.close();
    }
}
