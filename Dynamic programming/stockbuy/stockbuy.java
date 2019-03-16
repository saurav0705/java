
import java.io.*;
import java.util.*;

class stockbuy {
    public static void maxprofit(int[] arr) {
        int n = arr.length;
        int peak = 0;
        int drop = 0;
        int profit = 0;
        while (peak < n - 1) {
            if (arr[peak + 1] >= arr[peak]) {
                peak++;
            } else {
                if (profit < arr[peak] - arr[drop]) {
                    profit = arr[peak] - arr[drop];

                }
                peak = peak + 1;
                drop = peak;
            }
        }
        if (profit < arr[peak] - arr[drop]) {
            profit = arr[peak] - arr[drop];
        }
        System.out.println(profit);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = { 100, 180, 260, 310, 40, 535, 695 };
        maxprofit(arr);
    }
}
