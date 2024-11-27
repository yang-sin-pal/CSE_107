    package homework;
    import java.util.*;
    public class EUMADIS {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int integer_N = sc.nextInt();
            long[] theArray = new long[integer_N];
            for (int i = 0; i < theArray.length; i++) {
                theArray[i] = sc.nextLong();
            }
            long maxdif = 0;
            long temp_min = theArray[0];
            for (int i = 1; i < theArray.length; i++) {
                if (theArray[i] < temp_min) {
                    temp_min = theArray[i];
                }
                long tempdif = theArray[i] - temp_min;
                if (tempdif > maxdif) {
                    maxdif = tempdif;
                }
            }
            System.out.println(maxdif);
            sc.close();
        }    
    }
