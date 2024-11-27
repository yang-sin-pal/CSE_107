package homework;
import java.util.*;
public class EISNAIL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextLong();
        double B = sc.nextLong();
        double V = sc.nextLong();
        double Days = Math.ceil(((V-A)/(A-B)) + 1);
        System.out.println((long)Days);
        sc.close();
    }
}
