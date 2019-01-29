import java.io.*;
import java.util.*;

class arrayl {
    public static void main(String argms[]) throws IOException {
        ArrayList<Integer> al = new ArrayList<Integer>(9);
        al.add(1);
        al.add(8);
        al.add(4);
        al.add(3);
        for (Integer i : al) {
            System.out.println(i);
        }
    }
}