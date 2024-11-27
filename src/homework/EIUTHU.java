package homework;
import java.util.*;
public class EIUTHU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  firstPart = sc.nextLine();
        String  secondPart = sc.nextLine();
        long shortestLength = 0;
        if (firstPart.equals(secondPart)) {
            shortestLength = firstPart.length();
        } else {
            for(int i = firstPart.length(); i > 0; i--){
                if (secondPart.startsWith(firstPart.substring(i))) {
                    shortestLength = firstPart.length() + secondPart.length() - firstPart.substring(i).length();
                }
            }
        }
        System.out.println(shortestLength);
        sc.close();
    }
}
