
import java.io.*;
import java.util.*;

class mirrorpattern2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int flag = 1;
        int m = 0;
        int count2 = n / 2 + 1;
        for (int i = 0; i < n; i++) {
            if (i <= n / 2) {
                count = 1 + 2 * i;
                count2--;
            } else {
                count = count - 2;
                count2++;
            }
            for (int k = 0; k < count2; k++) {
                System.out.print(" ");
            }
            int printno = 0;
            if (i <= n / 2) {
                printno = flag;

            } else {
                printno = flag - m - 2;
                m = m + 2;
            }
            for (int j = 0; j < count; j++) {

                System.out.print(printno);
                printno++;

            }
            flag++;
            System.out.println();
        }
    }
}
