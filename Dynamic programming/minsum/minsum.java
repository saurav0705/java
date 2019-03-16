
import java.io.*;
import java.util.*;
import java.math.*;

class minsum {
    public static void minsum(int[] arr, int x) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] arr2 = new int[max + 1];
        for (int i = 0; i < n; i++) {
            arr2[arr[i]]++;
        }
        int count = 0;
        int k = 0;
        for (int m = max; m > -1; m--) {
            if (arr2[m] != 0) {
                while (arr2[m] != 0) {
                    System.out.println(count + " index::" + m + " value:: " + arr2[m]);
                    arr2[m] = arr2[m] - 1;
                    if (m % 2 != 0) {
                        k = (m / 2) + 1;
                    } else {
                        k = m / 2;
                    }
                    arr2[k]++;
                    count++;
                    if (count == x) {
                        break;
                    }
                }
            }

            if (count == x) {
                break;
            }

        }
        int sum = 0;
        for (int i = 0; i < max + 1; i++) {
            if (arr2[i] != 0) {
                sum = sum + i * arr2[i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long startTime = System.currentTimeMillis();
        /*
         * int n = Integer.parseInt(br.readLine()); int[] arr = new int[n]; for (int i =
         * 0; i < n; i++) { arr[i] = Integer.parseInt(br.readLine()); }
         */
        // int x = Integer.parseInt(br.readLine());
        int[] arr = { 5, 5, 5, 5, 5 };
        // System.out.println(Double.MIN_VALUE + " " + Double.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        minsum(arr, 4);

        long elapsedTime = System.currentTimeMillis();

        System.out.println(elapsedTime - startTime + "ms");
    }
}
