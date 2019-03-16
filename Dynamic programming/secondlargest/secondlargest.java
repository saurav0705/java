
import java.io.*;
import java.util.*;

class secondlargest {
    public static void secondlargestelement(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int diff = max - arr[0];
        int diff_element = arr[0];
        for (int i = 1; i < n; i++) {
            if (diff > max - arr[i] && max - arr[i] != 0) {
                diff = max - arr[i];
                diff_element = arr[i];
            }
        }
        System.out.println(diff_element);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = { 1, 4, 3, 1, 2 };
        /*
         * int n = Integer.parseInt(br.readLine()); int[] arr= new int[n]; for(int
         * i=0;i<n;i++) { arr[i]=Integer.parseInt(br.readLine()); }
         */
        secondlargestelement(arr);
    }
}
