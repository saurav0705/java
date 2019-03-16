import java.io.*;
import java.util.*;

class pattern {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int range = n;
        /*
         * for (int i = 0; i < 2 * n - 1; i++) { for (int k = 0; k < 2 * n - 1; k++) {
         * if (range == n - i && k<(2*n-1)/2) { System.out.print(range + " "); } else {
         * if (k < (2 * n - 1) / 2) { System.out.print(range + " "); range--; } else {
         * System.out.print(range + " "); range++; } } } range = n;
         * System.out.println(); }
         */
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (n - i == range) {
                    System.out.print(range);
                } else {
                    System.out.print(range);
                    range--;
                }
            }
            range = n;
            for (int k = 0; k < n; k++) {
                int l = 0;
                for (l = 0; l < n - 1 - k; l++) {
                    System.out.print(n - k);
                }
                range = n - k;
                for (int j = 0; j < n - l; j++) {
                    System.out.print(range);
                    range++;
                }
            }
            System.out.println();
            range = n;
        }
    }
}

import java.io.*;
import java.util.*;

class pattern{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
}

