
import java.io.*;
import java.util.*;

class subArray {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int sum_overall = -543453453, sum_current = -565565656;
        for (int k = 0; k < n; k++) {
            if (sum_current + arr[k] > arr[k]) {
                sum_current = sum_current + arr[k];
            } else {
                sum_current = arr[k];
            }

            if (sum_current > sum_overall) {
                sum_overall = sum_current;
            }
        }
        System.out.println("Max Sum::: " + sum_overall);
    }
}
