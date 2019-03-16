
import java.io.*;
import java.util.*;

class largestMatrix extends Vehicle {
    public static void A() {
        System.out.print("Good ");
        throw new RuntimeException();
    }

    public static void B() {
        A();
        System.out.print("This ");
    }

    public static void main(String[] args) {
        try {
            B();
        } catch (Exception e) {
            System.out.print("Time ");
        } finally {
            System.out.print("at CodingNinjas");
        }
    }
}

/*
 * class largestMatrix { public static void checkmat(String[] input, int n) {
 * 
 * int[][] mat_n = new int[n][n]; for (int i = 0; i < n; i++) { for (int j = 0;
 * j < n; j++) { mat_n[i][j] =
 * Integer.parseInt(Character.toString(input[i].charAt(j))); } } for (int i = 0;
 * i < n; i++) { for (int j = 0; j < n; j++) { System.out.print(mat_n[i][j]); }
 * System.out.println(); } // for(int)
 * 
 * }
 * 
 * public static void main(String args[]) throws IOException { BufferedReader br
 * = new BufferedReader(new InputStreamReader(System.in)); int[][] mat = { { 1,
 * 0, 1, 1 }, { 1, 1, 1, 0 }, { 1, 1, 1, 0 }, { 1, 1, 1, 0 } }; String[] str = {
 * "989", "191", "111" }; checkmat(str, 3);
 * 
 * }
 * 
 * }
 */
