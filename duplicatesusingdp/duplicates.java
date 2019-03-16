
import java.io.*;
import java.util.*;

class duplicatesusingdp {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = 0;
        for (int i = 0; i < x; i++) {
            int max_curr = arr[i];
            for (int k = i + 1; k < x; k++) {
                max_curr = max_curr + arr[k];
                if (max_curr > max) {
                    max = max_curr;
                }
            }

            // System.out.println(max_curr);

        }
        System.out.println("answer:: " + max);
    }
}
