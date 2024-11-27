package homework;

import java.util.*;

public class EIUTRIGLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integer_N = sc.nextInt();
        short s = 3276;
        long[] one_side_of_a_triangle = new long[integer_N];
        for (int i = 0; i < one_side_of_a_triangle.length; i++) {
            one_side_of_a_triangle[i] = sc.nextLong();
        }
        System.out.println(possible_triangles(one_side_of_a_triangle));
        sc.close();
    }
    
    static long possible_triangles(long[] one_side_of_a_triangle) {
        long possible_triangles = 0;
        
        for (int i = 0; i < one_side_of_a_triangle.length; i++) {
            for (int j = i + 1; j < one_side_of_a_triangle.length; j++) {
                if (j == one_side_of_a_triangle.length - 1) {
                    break;
                }
                for (int j2 = j + 1; j2 < one_side_of_a_triangle.length; j2++) {
                    if ((one_side_of_a_triangle[i] + one_side_of_a_triangle[j]) > one_side_of_a_triangle[j2]
                            && (one_side_of_a_triangle[i] + one_side_of_a_triangle[j2]) > one_side_of_a_triangle[j]
                            && (one_side_of_a_triangle[j] + one_side_of_a_triangle[j2]) > one_side_of_a_triangle[i]) {
                        possible_triangles++;
                    }
                }
                
            }
            if (i == one_side_of_a_triangle.length - 2) {
                break;
            }
        }
        return possible_triangles;
    }

    
}
