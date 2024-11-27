package homework;

import java.util.*;

public class EIEVERYN {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int numberTest = sc.nextInt();
        for (int i = 0; i < numberTest; i++) {
            int m_number = sc.nextInt();
            int[] arrayOf_m = new int[m_number];
            int n = sc.nextInt();
            for (int j = 0; j < arrayOf_m.length; j++) {
                arrayOf_m[j] = sc.nextInt();
            }
            boolean flag = true;
            for (int j = 1; j <= n; j++) {
                flag = true;
                for (int j2 = 0; j2 < arrayOf_m.length; j2++) {
                    if (j == arrayOf_m[j2]) {
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (flag) {
                sb.append("No\n");
            } else {
                sb.append("Yes\n");
            }
        }
        System.out.println(sb);
    }
}
