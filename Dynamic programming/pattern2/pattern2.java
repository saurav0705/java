
import java.io.*;
import java.util.*;

class pattern2 {
    public static void printpattern(int n) {
        int sp = 0;
        int p_star = 2 * n;
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int k = 0; k < p_star / 2; k++) {
                System.out.print("*");
            }
            for (int k = 0; k < sp; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < p_star / 2; k++) {
                System.out.print("*");
            }

            System.out.println();
            if (i < (2 * n - 1) / 2) {
                sp += 2;
                p_star -= 2;
            } else {
                sp -= 2;
                p_star += 2;
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printpattern(n);
    }
}
