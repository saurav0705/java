
import java.io.*;
import java.util.*;

class platforms {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Arrivals[] = { 900, 1000, 1100, 1130, 1200 };
        int departure[] = { 1100, 1000, 1200, 1300, 1400 };
        Arrays.sort(Arrivals);
        Arrays.sort(departure);
        int a = 0, b = 0, count = 0;
        while (a < Arrivals.length) {
            if (Arrivals[a] <= departure[b]) {
                count++;
                a++;

            } else {
                count--;
                b++;
            }
        }
        System.out.println(count);
    }
}
