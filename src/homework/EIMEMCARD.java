package homework;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EIMEMCARD {
    static InputReader reader = new InputReader(System.in);
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int million = 1000000;
        long[] threshold = { 1 * million, 20 * million, 50 * million, 200 * million,Long.MAX_VALUE/2 };

        double[] discount = { 0, 2, 3, 5, 7 };

        discountForEachPurchaseOfCustomers(discount, threshold);
    } 

    private static void discountForEachPurchaseOfCustomers(double[] discount,
            long[] threshold) {
        int numberItems = reader.nextInt();
        long sum = 0;
        for (int i = 0; i < numberItems; i++) {
            double sellingPrice = reader.nextDouble();
            for (int j = 0; j < threshold.length; j++) {
                if (sum < threshold[j]) {
                    sum += sellingPrice;
                    sellingPrice *= discount[j]/100;
                    break;
                }
            }
            
            sb.append(sellingPrice + " ");
        }
        System.out.println(sb);

    }


    static class InputReader {
        StringTokenizer tokenizer;
        BufferedReader reader;
        String token;
        String temp;

        public InputReader(InputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public InputReader(FileInputStream stream) {
            tokenizer = null;
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        public String nextLine() throws IOException {
            return reader.readLine();
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    if (temp != null) {
                        tokenizer = new StringTokenizer(temp);
                        temp = null;
                    } else {
                        tokenizer = new StringTokenizer(reader.readLine());
                    }
                } catch (IOException e) {
                }
            }
            return tokenizer.nextToken();
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}
