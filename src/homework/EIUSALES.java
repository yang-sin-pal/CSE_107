package homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

public class EIUSALES {
    static InputReader reader = new InputReader(System.in);

    public static void main(String[] args) {
        int salesOfEmployee = reader.nextInt();
        int[] salesVolumeOfTheLevel = { 0, 20, 50, 200, 500, 2000, Integer.MAX_VALUE };
        double[] bonusRate = { 0.02, 0.03, 0.04, 0.05, 0.06, 0.07 };
        double bonusOfEmployee = 0;

        for (int i = 0; i < bonusRate.length; i++) {
            if (salesOfEmployee > salesVolumeOfTheLevel[i]) {
                bonusOfEmployee += Math.min(salesOfEmployee - salesVolumeOfTheLevel[i],
                        salesVolumeOfTheLevel[i + 1] - salesVolumeOfTheLevel[i]) * bonusRate[i];
            }
        }
        String a = String.format("%e", bonusOfEmployee);
        System.out.println(a);
        System.out.printf(Locale.ENGLISH,"%s",a);
        

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

