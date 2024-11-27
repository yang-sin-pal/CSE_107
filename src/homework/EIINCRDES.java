package homework;
import java.util.*;;
public class EIINCRDES {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] array_n = new long[n];
        for (int i = 0; i < array_n.length; i++) {
            array_n[i] = sc.nextLong();
        }
        System.out.println(answer(array_n));
        
    }   
    static String answer(long[] array_n){
        String answer = "";
        if (array_n[0] > array_n[1]) {
            answer = "decreasing";
        }
        if (array_n[0] < array_n[1]) {
            answer = "increasing";
        }
        if (array_n[0] == array_n[1]) {
            answer = "none";
        } else {
            if (answer == "decreasing" && array_n.length > 3) {
                for (int i = 2; i < array_n.length; i++) {
                    if (array_n[i] >= array_n[i-1]) {
                        answer = "none";
                        break;
                    }
                }
            }
            if (answer == "increasing" && array_n.length > 3) {
                for (int i = 2; i < array_n.length; i++) {
                    if (array_n[i] <= array_n[i-1]) {
                        answer = "none";
                        break;
                    }
                }
            }
            
        }
        return answer;
    }
}
