
import java.io.*;
import java.util.*;

class targetsum {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int target = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        int a = 0, b = n - 1;
        while (a < b) {
            if (arr[a] + arr[b] == target) {
                System.out.println("Pair:: " + arr[a] + " " + arr[b]);
                a++;
                b--;
            } else if (arr[a] + arr[b] > target) {
                b--;
            } else if (arr[a] + arr[b] < target) {
                a++;
            }
        }
    }
}
