package homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class EIMEMCARD2 {
    static InputReader reader = new InputReader(System.in);

    public static void main(String[] args) {
        int the_number_of_items_purchased = reader.nextInt();
        double[] the_selling_price_of_n_products = new double[the_number_of_items_purchased];
        for (int i = 0; i < the_selling_price_of_n_products.length; i++) {
            the_selling_price_of_n_products[i] = reader.nextLong();
        }
        the_amount_of_discount_for_n_products(the_selling_price_of_n_products);

    }

    private static void the_amount_of_discount_for_n_products(double[] the_selling_price_of_n_products) {
            long the_total_purchase_value = 0;
            int million = 1000000;
            int[] the_specified_threshold = { 1 * million, 20 * million, 50 * million, 200 * million };
            double[] the_total_purchase_value_reaches_the_specified_threshold_When_buying_a_new_item_members_will_receive_a_discount = {
                    2, 3, 5, 7 };
            for (int i = 0; i < the_selling_price_of_n_products.length; i++) {
                double discount = 0;
                for (int j = the_specified_threshold.length - 1; j >= 0; j--) {
                    if (the_total_purchase_value >= the_specified_threshold[j]) {
                        discount = the_selling_price_of_n_products[i]
                                *  (the_total_purchase_value_reaches_the_specified_threshold_When_buying_a_new_item_members_will_receive_a_discount[j]
                                / 100);
                        System.out.print(discount + " ");
                        break;
                    } else if (j == 0) {
                        System.out.print(discount + " ");
                    }
                }
                the_total_purchase_value += the_selling_price_of_n_products[i];
        }
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

