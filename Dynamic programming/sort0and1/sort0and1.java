
import java.io.*;
import java.util.*;

class sort0and1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = { 0, 1, 0, 1, 0, 1, 0, 0 };
        int a = 0;
        int b = arr.length - 1;
        while (a < b) {
            if (arr[a] > arr[b]) {
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            } else if (arr[a] == arr[b]) {
                if (arr[a] == 1) {
                    b--;
                } else {
                    a++;
                }
            } else {
                a++;
                b--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
