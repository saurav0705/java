
import java.io.*;
import java.util.*;

class checkarray {

    public static boolean check(int[] arr1, int[] arr2, int chck) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n = arr1.length;
        for (int i = 0; i < n; i++) {
            if ((arr1[i] + arr2[n - 1 - i]) < chck) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = { 2, 1, 1, 2 };
        int[] arr2 = { 3, 3, 3, 4 };
        System.out.println(check(arr1, arr2, 10));
    }
}
